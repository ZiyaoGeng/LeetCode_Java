
/*
 * 最长子段和
 * 
 */
public class Solution {	
	/*
	 * 动态规划
	 */
	public int maxSubArray(int[] nums) {
		int sum=nums[0],b=0;
		for(int i=0;i<nums.length;i++){
			if(b>0)
				b+=nums[i];
			else
				b=nums[i];
			if(sum<b)
				sum=b;
		}
		return sum;
	}
	
	/*
	 * 分治算法
	 * T(n)={O(1)  n<=c
	 *      {2T(n/2)+O(n)  n>c
	 */
	public int maxSubArray(int[]nums,int left,int right){
		int sum=0;
		if(right==left)
			sum=nums[left];
		else{
			int center=(left+right)/2;
			int leftSum=maxSubArray(nums, left, center);
			int rightSum=maxSubArray(nums, center+1, right);
			
			int s1=nums[center];
			int lefts=0;
			for(int i=center;i>=left;i--){
				lefts+=nums[i];
				if(lefts>s1)
					s1=lefts;
			}
			int s2=nums[center+1];
			int rights=0;
			for(int i=center+1;i<=right;i++){
				rights+=nums[i];
				if(rights>s2)
					s2=rights;
			}
			sum=s1+s2;
			sum=sum<leftSum?leftSum:sum;
			sum=sum<rightSum?rightSum:sum;
		}
		return sum;
	}
	
	public int maxSubArray2(int[] nums) {
		return maxSubArray(nums, 0, nums.length-1);
	}
}

import java.util.Arrays;

public class Solution {
	public int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		if(nums.length<3)return 0;
		int closest=nums[0]+nums[1]+nums[2];
		for(int i=0;i<nums.length-2;i++){
			if (i > 0 && nums[i] == nums[i-1]) continue;
			int begin=i+1;
			int end=nums.length-1;
			while(begin<end){
				int close=nums[i]+nums[begin]+nums[end];
				if(Math.abs(closest-target)>Math.abs(close-target))
					closest=close;
				if(target-close==0)return close;
				if(target-close>0)begin++;
				if(target-close<0)end--;
			}
		}
		return closest;
	}
}

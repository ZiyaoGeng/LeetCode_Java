
public class Solution {
    public int findMin(int[] nums) {
        int left=0,right=nums.length-1;
        boolean flag=false;
        while(left<right){
            int mid=(left+right)/2;
            while(nums[left]==nums[mid]&&left<mid) {
                left++;
                flag=true;
            }
            while(nums[right]==nums[mid]&&right>mid) {
                right--;
                flag=true;
            }
            if(flag==true){
                flag=false;
                continue;
            }
            if(nums[mid]<nums[right])
                right=mid;
            else
                left=mid+1;
        }
        return nums[left];
    }
}

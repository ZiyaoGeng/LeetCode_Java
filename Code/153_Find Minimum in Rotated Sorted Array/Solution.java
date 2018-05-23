
public class Solution {
    public int findMin(int[] nums) {
        int left=0,right=nums.length-1;
        while (left<right-1){
            int mid=(left+right)/2;
            if((nums[left]<nums[mid]&&nums[mid]<nums[right])||(nums[left]>nums[mid]))
                right=mid;
            else
                left=mid;
        }
        return nums[left]>nums[right]?nums[right]:nums[left];
    }
}

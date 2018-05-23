
public class Solution {
    public int findMin(int[] nums) {
        int left=0,right=nums.length-1;
        boolean flag=false;
        while(left<right-1){
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
            if((nums[left]<nums[mid]&&nums[mid]<nums[right])||(nums[left]>nums[mid]))
                right=mid;
            else
                left=mid;
        }
        return nums[left]>nums[right]?nums[right]:nums[left];
    }
}

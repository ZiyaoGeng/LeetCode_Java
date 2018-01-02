
public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] range=new int[2];
        range[0]=range[1]=-1;
        if(nums==null||nums.length==0)
             return range;
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=(right+left)/2;
            if(nums[mid]==target){
                int l=mid,r=mid;
                while(l>=0&&r<nums.length&&(nums[l]==target||nums[r]==target)){
                    if(nums[l]==target)
                        l--;
                    if (nums[r]==target)
                        r++;
                }
                while (r<nums.length&&nums[r]==target)
                    r++;
                range[0]=l+1;
                range[1]=r-1;
                break;
            }
            else if(nums[mid]<target) {
                left = mid + 1;
            }
            else
                right=mid-1;
        }
        return range;
    }
}
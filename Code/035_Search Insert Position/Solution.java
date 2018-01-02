
public class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums==null||nums.length==0||nums[nums.length-1]<target)
            return nums.length;
        if(nums[0]>target)
            return 0;
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target)
                return mid;
            if(nums[mid]<target)
                left=mid+1;
            if(nums[mid]>target)
                right=mid-1;
        }
        if(nums[right]>target)
            return right;
        else
            return left;
    }
}

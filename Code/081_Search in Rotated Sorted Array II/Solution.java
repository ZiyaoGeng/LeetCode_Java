
public class Solution {
    public boolean search(int[] nums, int target) {
        if(nums==null||nums.length==0)
            return false;
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target)
                return true;
            if(nums[mid]<nums[right]){
                if(nums[mid]<target&&target<=nums[right])
                    left=mid+1;
                else
                    right=mid-1;
            }
            else if(nums[mid]>nums[right]){
                if(nums[left]<=target&&target<nums[mid])
                    right=mid-1;
                else
                    left=mid+1;
            }
            else{
                right--;//相等时移动边缘位置，找到不同或right==mid
            }
        }
        return false;
    }
}

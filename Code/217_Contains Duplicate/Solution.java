
import java.util.Arrays;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length==0)
            return false;
        Arrays.sort(nums);
        int left=nums[0];
        for (int i=1;i<nums.length;i++){
            if (nums[i]==left)
                return true;
            else
                left=nums[i];
        }
        return false;
    }
}

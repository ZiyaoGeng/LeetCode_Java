import java.util.Arrays;

public class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums.length%2!=0?nums[nums.length/2]:nums[nums.length/2-1];
    }
}

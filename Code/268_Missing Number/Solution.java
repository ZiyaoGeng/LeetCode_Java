
public class Solution {
    public int missingNumber(int[] nums) {
        int num=0;
        for(int i=1;i<=nums.length;i++)
            num=num+i-nums[i-1];
        return num;
    }
}

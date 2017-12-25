
public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int counter = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[counter-1] != nums[i]) {
                if(counter!=i)
                    nums[counter]=nums[i];
                counter++;
            }
        }
        return counter;
    }
    public static void main(String[]args){
        int[] nums={1,1,2,2,3,4};
        new Solution().removeDuplicates(nums);
    }
}

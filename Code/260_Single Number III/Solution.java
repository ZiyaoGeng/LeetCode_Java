import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] singleNumber(int[] nums) {
        int[] n = new int[2];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!list.contains(nums[i]))
                list.add(nums[i]);
            else
                list.remove(new Integer(nums[i]));
        }
        if (list.size() != 0) {
            n[0] = list.get(0);
            n[1] = list.get(1);
        }
        return n;
    }
}

import java.util.HashMap;

public class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(new Integer(nums[i]))) {
                map.remove(nums[i]);
            }
            else
                map.put(nums[i],1);
        }
        return map.keySet().iterator().next();
    }
    public static void main(String[]args){
        int[]nums={1,2,2,3,4,4,1};
        System.out.println(new Solution().singleNumber(nums));
    }
}

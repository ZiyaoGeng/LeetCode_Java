import java.util.ArrayList;
import java.util.List;
public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();
        backtrack(list,new ArrayList<>(),nums);
        return list;
    }
    public void backtrack(List<List<Integer>>list,List<Integer>lists,int[]nums){
        if(lists.size()==nums.length) {
            list.add(new ArrayList<>(lists));
        }
        for(int i=0;i<nums.length;i++){
            if(lists.contains(nums[i]))
                continue;
            lists.add(nums[i]);
            backtrack(list,lists,nums);
            lists.remove(lists.size()-1);
        }
    }
}

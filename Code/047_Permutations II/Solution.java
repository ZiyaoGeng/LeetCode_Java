import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();
        Arrays.sort(nums);
        boolean[]used=new boolean[nums.length];
        backtrack(list,new ArrayList<>(),nums,used);
        return list;
    }
    public void backtrack(List<List<Integer>>list,List<Integer>list1,
                          int[]nums,boolean[] used){
        if(list1.size()==nums.length)
            list.add(new ArrayList<>(list1));
        for(int i=0;i<nums.length;i++){
            if(used[i])
                continue;
            if(i>0&&nums[i-1]==nums[i]&&!used[i-1])
                continue;
            used[i]=true;
            list1.add(nums[i]);
            backtrack(list,list1,nums,used);
            used[i]=false;
            list1.remove(list1.size()-1);
        }
    }
}

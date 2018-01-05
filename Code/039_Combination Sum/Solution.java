import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    List<List<Integer>>list=new ArrayList<>();
    public List<List<Integer>> combinationSum
            (int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer>list1=new ArrayList<>();
        combination(candidates,0,target,list1);
        return list;
    }
    public void combination
            (int[]candidates,int from,int target,List<Integer>list1){
        if(target==0){
            List<Integer>list2=new ArrayList<>(list1);
            list.add(list2);
            return;
        }
        else{
            for(int i=from;i<candidates.length&&candidates[i]<=target;i++){
                list1.add(candidates[i]);
                combination(candidates,i,target-candidates[i],list1);
                list1.remove(new Integer(candidates[i]));
            }
        }
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    List<List<Integer>>list=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer>list1=new ArrayList<>();
        Arrays.sort(candidates);
        combination(candidates,target,0,list1);
        return list;
    }
    public void  combination(int[]candidates,int target,int from,List<Integer>list1){
        if(target==0){
            List<Integer>list2=new ArrayList<>(list1);
            list.add(list2);
            return;
        }
        if(target<0)
            return;
            for(int i=from;i<candidates.length;i++){
                if(i>from&&candidates[i]==candidates[i-1])
                    continue;
                target-=candidates[i];
                list1.add(candidates[i]);
                combination(candidates,target,i+1,list1);
                target+=candidates[i];
                list1.remove((Integer)candidates[i]);
            }
    }
}

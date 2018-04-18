import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();
        subOne(nums,list,new ArrayList<>(),0);
        return list;
    }
    public void subOne(int[]nums,List<List<Integer>>list,List<Integer>list1,int k){
        if(k<=nums.length){
            List<Integer>temp=new ArrayList<>(list1);
            list.add(temp);
        }
        for(int i=k;i<nums.length;i++){
            list1.add(nums[i]);
            subOne(nums,list,list1,i+1);
            list1.remove(list1.get(list1.size()-1));
        }
    }
}

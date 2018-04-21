import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>list=new ArrayList<>();
        subSum(nums,list,new ArrayList<>(),0);
        return list;
    }
    public void subSum(int[]nums,List<List<Integer>>list,List<Integer>list1,int k){
        if(k<=nums.length){
            list.add(new ArrayList<>(list1));
        }
        for(int i=k;i<nums.length;i++){
            list1.add(nums[i]);
            subSum(nums,list,list1,i+1);
            list1.remove(list1.size()-1);
            while(i<nums.length-1&&nums[i]==nums[i+1])
                i++;
        }
    }
}

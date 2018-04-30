import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>list=new ArrayList<>();
        if(n>=k)
            com(n,k,1,list,new ArrayList<>());
        return list;
    }
    public void com(int n,int k,int m,List<List<Integer>>list,List<Integer>list1){
        if(k==0){
            list.add(new ArrayList<>(list1));
        }
        for(int i=m;k!=0&&i<=n;i++){
            list1.add(i);
            com(n,k-1,i+1,list,list1);
            list1.remove(list1.size()-1);
        }
    }
}

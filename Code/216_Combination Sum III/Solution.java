import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>>list=new ArrayList<>();
        help(list,new ArrayList<>(),k,n,1);
        return list;
    }
    public void help(List<List<Integer>>list,List<Integer>list1,
                     int k,int n,int j){
        if(n==0&&k==0){
            list.add(new ArrayList<>(list1));
            return;
        }
        for(int i=j;i<10&&i<=n&&k>0;i++){
            list1.add(i);
            help(list,list1,k-1,n-i,i+1);
            list1.remove(new Integer(i));
        }
    }
}

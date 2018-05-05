import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>>list=new ArrayList<>();
        solve(list,new ArrayList<>(),new ArrayList<>(),new ArrayList<>(),
                new ArrayList<>(),n,0);
        return list;
    }
    public void add(List<String>list,int k,int n){
        String s="";
        for(int i=0;i<n;i++){
            if(i==k)
                s+="Q";
            else
                s+=".";
        }
        list.add(s);
    }
    public void solve(List<List<String>>list,List<String>list1,
                      List<Integer>list2,List<Integer>list3,List<Integer>list4
                      ,int n,int row){
        if(row==n)
            list.add(new ArrayList<>(list1));
        else
        for(int i=0;i<n;i++){
            if(!list2.contains(new Integer(row-i))&&
                    !list4.contains(new Integer(row+i))
            &&!list3.contains(new Integer(i))) {
                add(list1, i, n);
                list2.add(row-i);
                list4.add(row+i);
                list3.add(i);
            }
            else
                continue;
            solve(list,list1,list2,list3,list4,n,row+1);
            list1.remove(list1.size()-1);
            list2.remove(list2.size()-1);
            list3.remove(list3.size()-1);
            list4.remove(list4.size()-1);
        }
    }

}

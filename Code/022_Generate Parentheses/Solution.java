import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>list=new ArrayList<>();
        generate(list,n,0,0,"");
        return list;
    }
    private void generate(List<String>list,int n,
                         int left,int right,String str){
        if(str.length()==n*2){
            list.add(str);
            return;
        }
        if(left<n){
            String next=str+'(';
            generate(list,n,left+1,right,next);
        }
        if(right<n&&right<left) {
            String next=str+')';
            generate(list,n,left,right+1,next);
        }
    }
}

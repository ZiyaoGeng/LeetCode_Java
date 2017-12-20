import java.util.ArrayList;
import java.util.List;
/*
树
 */
public class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> list=new ArrayList<>();
        String[] table={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        letterCombinations(list,digits,"",0,table);
        return list;
    }
    private void letterCombinations(List<String>list,String digits,String curr,
                                    int index,String[]table){
        if(index==digits.length()){
            if(curr.length()!=0)
                list.add(curr);
        }
        String temp=table[digits.charAt(index-'0')];
        for(int i=0;i<temp.length();i++){
            String next=curr+temp.charAt(i);
            letterCombinations(list,digits,next,index+1,table);
        }
    }
}

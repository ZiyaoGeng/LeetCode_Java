import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>list=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer>list1=new ArrayList<>();
            list1.add(1);
            if(i>1){
                List<Integer>list2=list.get(i-1);
                for(int j=1;j<list2.size();j++)
                    list1.add(list2.get(j-1)+list2.get(j));
            }
            if(i!=0)
            list1.add(1);
            list.add(list1);
        }
        return list;
    }
}

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            list.add(0,1);
            for(int j=1;j<list.size()-1;j++){
                list.set(j,list.get(j)+list.get(j+1));
            }
        }
        return list;
    }
    public static void main(String[]args){
        System.out.println(new Solution().getRow(3).toString());
    }
}

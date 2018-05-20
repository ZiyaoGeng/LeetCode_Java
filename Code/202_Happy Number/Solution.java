import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean isHappy(int n) {
        List<String>list=new ArrayList<>();
        String num=String.valueOf(n);
        while (!num.equals("1")){
            int sum=0;
            for(int i=0;i<num.length();i++){
                sum+=(num.charAt(i)-'0')*(num.charAt(i)-'0');
            }
            num=sum+"";
            if(list.contains(num))
                break;
            list.add(num);
        }
        if(!num.equals("1"))
            return false;
        return true;
    }
}

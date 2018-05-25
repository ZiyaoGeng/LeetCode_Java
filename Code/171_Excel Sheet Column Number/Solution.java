
public class Solution {
    public int titleToNumber(String s) {
        int num=0;
        for(int i=0;i<s.length();i++){
            num+=(s.charAt(i)-'A'+1)*Math.pow(26,(s.length()-i-1));
        }
        return num;
    }
}

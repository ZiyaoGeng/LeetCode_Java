
public class Solution {
    public String convertToTitle(int n) {
        String str="";
        while(n!=0){
            str=((char)(--n%26+'A'))+str;
            n/=26;
        }
        return str;
    }
}

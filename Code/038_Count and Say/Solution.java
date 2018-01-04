
public class Solution {
    public String countAndSay(int n) {
        if(n==1)
            return "1";
        if(n==2)
            return "11";
        else{
            String str=countAndSay(n-1);
            String temp="";
            int counter=1;
            for(int i=0;i<str.length()-1;i++){
                if(str.charAt(i)==str.charAt(i+1))
                    counter++;
                else{
                    temp+=""+counter+str.charAt(i);
                    counter=1;
                }
            }
            temp+=""+counter+str.charAt(str.length()-1);
            return temp;
        }
    }
}

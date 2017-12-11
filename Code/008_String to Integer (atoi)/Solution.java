
public class Solution {
    public int myAtoi(String str) {
        if(str.equals(""))
            return 0;
        boolean flag=false,sign=true;
        long x=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ') {
                if(flag==false)
                    continue;
                else break;
            }
            else if(48<=str.charAt(i)&&str.charAt(i)<=57){
                x=x*10+Integer.parseInt(str.charAt(i)+"");
                flag=true;
                if(x>Integer.MAX_VALUE) {
                    if (sign == true)
                        return Integer.MAX_VALUE;
                    else
                        return Integer.MIN_VALUE;
                }
            }
            else{
                if(flag==false&&(str.charAt(i)=='+'||str.charAt(i)=='-')){
                    if(str.charAt(i)=='-')
                        sign = false;
                    flag=true;
                }
                else
                    break;
            }
        }
        if(sign == true)
            return (int)x;
        else
            return (int)x*-1;
    }
}

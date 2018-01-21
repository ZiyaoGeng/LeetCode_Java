public class Solution {
    public String addStrings(String num1, String num2) {
        String sum="";
        int count=0;
        int i=num1.length()-1;
        int j=num2.length()-1;
        while(i>=0||j>=0||count!=0){
            int a=i>=0?Integer.valueOf(num1.charAt(i--)+""):0;
            int b=j>=0?Integer.valueOf(num2.charAt(j--)+""):0;
            int num=a+b+count;
            sum=num%10+sum;
            count=num/10;
        }
        return sum;
    }
}

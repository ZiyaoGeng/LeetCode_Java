
/*
罗马数字转数字（1-3999）
Ⅰ（1）、X（10）、C（100）、M（1000）、V（5）、L（50）、D（500）
 */
public class Solution {
    public int romanToInt(String s) {
        if(s.equals(""))
            return 0;
        int c=RTI(s.charAt(0));
        for(int i=1;i<s.length();i++){
            c+=RTI(s.charAt(i));
            if(RTI(s.charAt(i-1))<RTI(s.charAt(i)))
                c-=2*RTI(s.charAt(i-1));
        }
        return c;
    }
    public int RTI(char c){
        switch (c){
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
        }
        return 0;
    }
}

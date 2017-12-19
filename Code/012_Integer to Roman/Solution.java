
/*
数字转罗马数字（1-3999）
Ⅰ（1）、X（10）、C（100）、M（1000）、V（5）、L（50）、D（500）
 */
public class Solution {
    public String intToRoman(int num) {
        String[][]roman={
                {"","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"},
                {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
                {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},
                {"", "M", "MM", "MMM"}
                };
        String ret="";
        int dight=0;
        while (num>0){
            int c=num%10;
            ret=roman[dight][c]+ret;
            dight++;
            num/=10;
        }
        return ret;
    }
}

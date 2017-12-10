/*
ZigZag可以看做一个V各个对应的两个数字之和等于V或倒V的底部或顶部*2
 */
public class Solution {
    public String convert(String s, int numRows) {
        if(s.length()<=1||numRows==1)
            return s;
        String str="";
        for(int i=0;i<numRows;i++) {
            int j = i;
            int counter=0;
            while (j < s.length()) {
                str+=s.charAt(j);
                if (i == 0 || i + 1 == numRows) //第一行和最后一行
                    j += (numRows - 1) * 2;
                else{
                    j=(numRows-1+(numRows-1)*counter)*2-j;//(n+(n-1)*c)*2-j
                    counter++;
                }
            }
        }
        return str;
    }
}

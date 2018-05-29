
public class Solution {
    public boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;
        while (i<j){
            if(!isValid(s.charAt(i))){
                i++;
                continue;
            }
            if(!isValid(s.charAt(j))){
                j--;
                continue;
            }
            if (s.charAt(i)==s.charAt(j)||
                    ((s.charAt(i)>57&&s.charAt(j)>57)&&(s.charAt(i)-32==s.charAt(j)
                    ||s.charAt(i)+32==s.charAt(j)))){
                i++;
                j--;
            }
            else
                return false;
        }
        return true;
    }
    public boolean isValid(char c){
        if(c<48||(c>57&&c<65)||(c>90&&c<97)||c>122)
            return false;
        return true;
    }
}

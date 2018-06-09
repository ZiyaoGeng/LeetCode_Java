
public class Solution {
    public static boolean isAnagram(String s, String t) {
        if(t.length()!=s.length())
            return false;
        int[]flag=new int[26];
        for(int i=0;i<s.length();i++){
            flag[s.charAt(i)-'a']++;
            flag[t.charAt(i)-'a']--;
        }
        for(int i=0;i<flag.length;i++)
            if (flag[i]!=0)
                return false;
        return true;

    }
}

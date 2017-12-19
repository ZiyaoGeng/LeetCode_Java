
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
            return "";
        String common=strs[0];
        for(int i=1;i<strs.length;i++){
            int j=0;
            for(;j<Math.min(common.length(),strs[i].length());j++){
                if(common.charAt(j)!=strs[i].charAt(j)){
                    break;
                }
            }
            common=common.substring(0,j);
        }
        return common;
    }
}

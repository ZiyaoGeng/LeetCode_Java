
public class Solution {
	public String longestPalindrome(String s) {
		if (s == null || s.length() == 0)
			return null;
		if (s.length() == 1)
			return s;
		int left, right;
		String longestStr = s.substring(0, 1);
		for (int i = 0; i < s.length(); i++) {
			left=i;right=i;     //以字母为分界线
			String str=getLength(s,left,right);
			if(str.length()>longestStr.length())
				longestStr=new String(str);
			if(i!=s.length()-1){
				left=i;
				right=i+1;        //以空隙为分界线
				str=getLength(s,left,right);
				if(str.length()>longestStr.length())
					longestStr=new String(str);
			}
		}
		return longestStr;
	}
    public String getLength(String s,int left,int right){
		while(left>=0&&right<s.length()&&(s.charAt(left)==s.charAt(right))) {
			left--;
			right++;
		}
		return s.substring(left+1,right);
	}
}

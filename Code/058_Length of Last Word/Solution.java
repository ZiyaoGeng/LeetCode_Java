
/*
 * 最后一个为空格时，继续向前找，直到找到单词或返回0
 */
public class Solution {
	public int lengthOfLastWord(String s) {
		int length=0;
		if(s.equals(""))
			return 0;
		for(int i=s.length()-1;i>=0;i--){
			if(s.charAt(i)!=' ')
				length++;
			else if(length==0)
				continue;
			else
				break;
		}
		return length;
    }
}


/*
 * ���һ��Ϊ�ո�ʱ��������ǰ�ң�ֱ���ҵ����ʻ򷵻�0
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
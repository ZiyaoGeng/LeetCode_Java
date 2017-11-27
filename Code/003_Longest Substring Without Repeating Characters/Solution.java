import java.util.Arrays;

/*
 * 有两个指针，left和遍历数组时的i
 * 不同的字符的索引存放到数组中（索引为ASCII码）
 * 第二次找到该字符时，改变left到第一个字符的位置
 */
public class Solution {
	int lengthOfLongestSubstring(String s) {  
		int []m=new int[256];
		Arrays.fill(m, -1);
		int left=-1,res=0;
		for(int i=0;i<s.length();i++){
			left=Math.max(left, m[s.charAt(i)]);
			m[s.charAt(i)]=i;
			res=Math.max(res, i-left);
		}
		return res;
	}
}

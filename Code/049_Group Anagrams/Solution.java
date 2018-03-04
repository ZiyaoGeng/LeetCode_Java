/*
1��hashmap��ӳ���ϵ��String-List
2����map�в�������ͬ�ַ���������һ����Ԫ�أ������ڣ��������֪��List��
3���ַ���ͨ��ת��Ϊ�ַ����飬��������Ƚ�
 */
import java.util.*;

public class Solution {
	public List<List<String>> groupAnagrams(String[] strs) {
		if (strs.length == 0) return new ArrayList();
		Map<String, List>ans = new HashMap<>();
		for (String s : strs) {
			char[] ca = s.toCharArray();
			Arrays.sort(ca);
			String key = String.valueOf(ca);
			if (!ans.containsKey(key)) ans.put(key, new ArrayList());
			ans.get(key).add(s);
		}
		return new ArrayList(ans.values());
	}
}

/*
1、hashmap的映射关系：String-List
2、若map中不存在相同字符串，则构造一个新元素；若存在，则存入已知的List中
3、字符串通过转化为字符数组，进行排序比较
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

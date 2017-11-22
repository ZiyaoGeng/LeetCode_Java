import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
	/*
	 * O(n)=n^2
	 */
	public int[] twoSum(int[] nums, int target) {
		int i=0,j=0;
		int[] array=new int[2];
		for(;i<nums.length-1;i++)
			for(j=i+1;j<nums.length;j++){
				if(nums[j]+nums[i]==target){
					array[0]=i;
					array[1]=j;
					}
				}
		return array;
	}
	/*
	 * 使用哈希表
	 * 保存当前遍历值的对应值（target-cur）为key，当前值的索引为value
	 * 如果当前循环中，cur与map中key相等的话就找到了对应的匹配值，
	 * O(n)=n;
	 */
	public int[] twoSum2(int[]nums,int target){
		int[]result=new int[2];
		Map<Integer, Integer>map=new HashMap<>();
		  //扫一遍数组，一边扫一边存
		for(int i=0;i<nums.length;i++){
			int cur=nums[i];
			int toFind=target-cur;
			if(map.containsKey(cur)){//如果发现之前需要的插值，则保存两个index
				result[0]=map.get(cur);
				result[1]=i;
				return result;
			}
			else
				map.put(toFind, i);//没有，就put到map里面
		}
		return result;
	}
}

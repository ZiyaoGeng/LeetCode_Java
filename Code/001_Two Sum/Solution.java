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
	 * ʹ�ù�ϣ��
	 * ���浱ǰ����ֵ�Ķ�Ӧֵ��target-cur��Ϊkey����ǰֵ������Ϊvalue
	 * �����ǰѭ���У�cur��map��key��ȵĻ����ҵ��˶�Ӧ��ƥ��ֵ��
	 * O(n)=n;
	 */
	public int[] twoSum2(int[]nums,int target){
		int[]result=new int[2];
		Map<Integer, Integer>map=new HashMap<>();
		  //ɨһ�����飬һ��ɨһ�ߴ�
		for(int i=0;i<nums.length;i++){
			int cur=nums[i];
			int toFind=target-cur;
			if(map.containsKey(cur)){//�������֮ǰ��Ҫ�Ĳ�ֵ���򱣴�����index
				result[0]=map.get(cur);
				result[1]=i;
				return result;
			}
			else
				map.put(toFind, i);//û�У���put��map����
		}
		return result;
	}
}

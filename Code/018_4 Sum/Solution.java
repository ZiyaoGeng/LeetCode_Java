import java.util.*;
public class Solution {
	  public List<List<Integer>> fourSum(int[] nums, int target) {
		  Arrays.sort(nums);
		  List<List<Integer>>list=new ArrayList<>();
		  for(int i=0;i<nums.length-3;i++){
			  if(i!=0&&nums[i]==nums[i-1])
				  continue;
			  for(int j=i+1;j<nums.length-2;j++){
				  if(j!=i+1&&nums[j]==nums[j-1])
					  continue;
				  int l=j+1,r=nums.length-1;
		    		while(l<r){
		    			if(nums[l]+nums[r]+nums[j]+nums[i]==target){
		    				List<Integer>list1=new ArrayList<>();
		    				list1.add(nums[i]);
		    				list1.add(nums[j]);
		    				list1.add(nums[l]);
		    				list1.add(nums[r]);
		    				list.add(list1);
		    				while(l<r&&nums[l]==nums[l+1])l++;
		    				while(l<r&&nums[r]==nums[r-1])r--;
		    				l++;r--;
		    			}
		    			else if(nums[l]+nums[r]+nums[i]+nums[j]<target)
		    				l++;
		    			else
		    				r--;
		    		}
			  }
		  }
		  return list;
	  }
}

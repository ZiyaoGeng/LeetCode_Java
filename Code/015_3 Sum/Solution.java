import java.util.*;
public class Solution {    
    public List<List<Integer>> threeSum(int[] num) {
    	List<List<Integer>> list = new ArrayList<List<Integer>>();
    	Arrays.sort(num);
    	for(int i=0;i<num.length-2;i++){
    		if(i!=0&&num[i]==num[i-1])
    			continue;
    		int l=i+1,r=num.length-1;
    		while(l<r){
    			if(num[l]+num[r]+num[i]==0){
    				List<Integer>list1=new ArrayList<>();
    				list1.add(num[i]);
    				list1.add(num[l]);
    				list1.add(num[r]);
    				list.add(list1);
    				while(l<r&&num[l]==num[l+1])l++;
    				while(l<r&&num[r]==num[r-1])r--;
    				l++;r--;
    			}
    			else if(num[l]+num[r]+num[i]<0)
    				l++;
    			else
    				r--;
    		}
    	}
    	return list;
    }
}  

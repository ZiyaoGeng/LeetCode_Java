import java.util.Arrays;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[]nums=new int[Math.min(nums1.length,nums2.length)];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0,k=0;
        while (i<nums1.length&&j<nums2.length){
            if(nums1[i]==nums2[j]){
                if(k==0||(k>0&&nums[k-1]!=nums1[i])) {
                    nums[k] = nums1[i];
                    k++;
                }
                i++;j++;
            }
            else if(nums1[i]<nums2[j])
                i++;
            else if(nums1[i]>nums2[j])
                j++;
        }
        int[]num=new int[k];
        for(int m=0;m<k;m++)
            num[m]=nums[m];
        return num;
    }
}

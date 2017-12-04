
public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total=nums1.length+nums2.length;
        if(total%2!=0)
            return findKth(nums1,nums2,total/2+1);
        else
            return (double)(findKth(nums1, nums2, total / 2)
                    + findKth(nums1, nums2, total / 2 + 1)) / 2;
    }
    //找第k个小的数（1,2,3,4....）
    public int findKth(int[]nums1,int[]nums2,int k){
        if(nums1.length>nums2.length)
            return findKth(nums2,nums1,k); //把长度小的数组放在前面，若小的放在后面，则有可能pb出现负数
        if(nums1.length==0)
            return nums2[k-1];
        if(k==1)
            return nums1[0]>nums2[0]?nums2[0]:nums1[0];
        int pa=nums1.length<k/2? nums1.length:k/2;
        int pb=k-pa;
        if(nums1[pa-1]<nums2[pb-1])
            return findKth(ArraySub(nums1,pa),nums2,k-pa);
        else if(nums1[pa-1]>nums2[pb-1])
            return findKth(nums1,ArraySub(nums2,pb),k-pb);
        else
            return nums1[pa-1];
    }
    public int[] ArraySub(int[]num,int n){
        if(n>num.length)
            return null;
        int j=0;
        int[] numSub=new int[num.length-n];
        for(int i=n;i<num.length;i++) {
            numSub[j++]=num[i];
        }
        return numSub;
    }
    public static void main(String[]args){
        int[]nums1={1,3,4,5,6};
        int[]nums2={2,7,8};
        System.out.println(new Solution().findKth(nums1,nums2,6));
        System.out.println(new Solution().findMedianSortedArrays(nums1,nums2));
    }
}


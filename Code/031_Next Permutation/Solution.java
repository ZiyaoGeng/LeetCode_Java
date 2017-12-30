/*
全排列，查找下一个排列的组合
使用了字典序法
可以理解为去查找一个比当前数(数组中每个数字组合起来的数)大且最接近的数
 */
public class Solution {
    public void nextPermutation(int[] nums) {
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i+1]>nums[i]) {
                int j;
                for (j = nums.length - 1; j > i; j--) {
                    if(nums[j]>nums[i])
                        break;
                }
                swap(nums,i,j);
                reverse(nums,i+1,nums.length-1);
                return;
            }
        }
        reverse(nums,0,nums.length-1);
    }
    public void reverse(int[]nums,int i,int j){
        while(i<j)
            swap(nums,i++,j--);
    }
    public void swap(int[]nums,int i,int j){
        if(i<=nums.length-1&&j<=nums.length-1){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
    }
}

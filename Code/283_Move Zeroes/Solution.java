
public class Solution {
    public void moveZeroes(int[] nums) {
        int k=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0&&k==-1)
                k=i;
            if(nums[i]!=0&&k!=-1)
                nums[k++]=nums[i];
        }
        for(int i=k;k!=-1&&i<nums.length;i++)
            nums[i]=0;
    }
}

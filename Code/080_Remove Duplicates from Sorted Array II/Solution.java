
public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)
            return 0;
        int left=-1,right=1,flag=0;
        for(;right<nums.length;right++){
            if(right-flag==1){
                if(nums[flag]!=nums[right]) {
                    nums[++left]=nums[flag];
                    flag++;
                }
                else
                    nums[++left]=nums[flag];
            }
            else if(right-flag==2){
                if(nums[flag]!=nums[right]) {
                    nums[++left]=nums[flag];
                    flag+=2;
                }
                else
                    nums[++left]=nums[flag];
            }
            else{
                if(nums[flag]!=nums[right])
                    flag=right;
            }
        }
        if(right-flag==2||right-flag==1)
            nums[++left]=nums[right-1];
        return left+1;
    }
}

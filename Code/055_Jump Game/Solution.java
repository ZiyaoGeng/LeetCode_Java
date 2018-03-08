
public class Solution {
//    public boolean canJump(int[] nums) {
//        return bool(nums,0);
//    }
//    public boolean bool(int []nums,int count){
//        if(count==nums.length-1)
//            return true;
//        for(int i=count+1;i<nums.length
//                &&i<=count+nums[count];i++) {
//            if(bool(nums,i))
//                return true;
//        }
//        return false;
//    }
   public boolean canJump(int[] nums) {
    int lastPos = nums.length - 1;
    for (int i = nums.length - 1; i >= 0; i--) {
        if (i + nums[i] >= lastPos) {
            lastPos = i;
        }
    }
    return lastPos == 0;
}
}





public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int min=0,left=0,right=0,num=0;
        while (left<=right&&left<nums.length&&right<=nums.length){
            if(num<s&&right<nums.length) {
                num+=nums[right];
                right++;
            }
            else if(num>=s){
                min=min==0?right-left:min<right-left?min:right-left;
                num-=nums[left];
                left++;
            }
            else {
                num-=nums[left];
                left++;
            }
        }
        return min;
    }
}

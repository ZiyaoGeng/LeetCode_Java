import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[]index=new int[2];
        int left=0,right=numbers.length-1;
        while(left<=right){
            if(numbers[left]+numbers[right]<target)
                left++;
            else if (numbers[left]+numbers[right]>target)
                right--;
            else{
                index[0]=left+1;
                index[1]=right+1;
                break;
            }
        }
        return index;
    }
}


public class Solution {
    public void sortColors(int[] nums) {
        int red=0;
        int blue=nums.length-1;
        for(int i=0;i<=blue && i < nums.length;) {
            if (nums[i] == 0 && i > red ) {
                swap(nums,i,red++);
            } else if (nums[i] == 2 && i < blue)
                swap(nums,i,blue--);
            else
                i++;
        }
    }
    private void swap(int A[], int a, int b) {
        int temp = A[a];
        A[a] = A[b];
        A[b] = temp;
    }
}

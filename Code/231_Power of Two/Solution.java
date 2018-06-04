
public class Solution {
    public boolean isPowerOfTwo(int n) {
        if((n-1&n)==0&&n>0)
            return true;
        else
            return false;
    }
}


public class Solution {
    //倒叙进行比较
    public boolean isPalindrome(int x) {
        if(x<0)return false;
        long j=x;
        long k=0;
        while(x!=0){
            k=k*10+x%10;
            x=x/10;
        }
        if(j==k)
            return true;
        else
            return false;
    }
}

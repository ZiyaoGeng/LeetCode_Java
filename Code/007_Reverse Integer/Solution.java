
public class Solution {
    public int reverse(int x) {
        long k=0;
        while(x!=0){
            k=k*10+x%10;
            x=x/10;
        }
        if(Math.abs(k)>Integer.MAX_VALUE)
            return 0;
        return (int)k;
    }
}


/*
 * ¿¼ÂÇÕûĞÍ·¶Î§
 */
public class Solution {
    public int mySqrt(int x) {
    	double i=0;
    	while(i*i<=x){
    		i++;
    	}
    	return (int)--i;
    }
}

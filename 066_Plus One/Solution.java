
/*
 * 不进位末尾+1
 * 设置不断进位情况
 * 特殊全为9，则申请一个比原数组+1大的数组，第一位为1
 */
public class Solution {
	public int[] plusOne(int[] digits) {
		int c=1;    //进位且表示+1
		for(int i=digits.length-1;i>=0;i--){
			int a=digits[i]+c;
			digits[i]=a%10;
			c=a/10;
		}
		if(c==1){
			int[]a=new int[digits.length+1];
			a[0]=1;
			return a;
		}
		return digits;
    }
}

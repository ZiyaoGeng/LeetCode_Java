
/*
 * ����λĩβ+1
 * ���ò��Ͻ�λ���
 * ����ȫΪ9��������һ����ԭ����+1������飬��һλΪ1
 */
public class Solution {
	public int[] plusOne(int[] digits) {
		int c=1;    //��λ�ұ�ʾ+1
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

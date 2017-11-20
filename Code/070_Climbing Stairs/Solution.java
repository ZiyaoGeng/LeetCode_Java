
public class Solution {
	public int climbStairs(int n) {
		/*
		 * 动态规划
		 * 两个变量去存储过程
		 */
		int a = 1, b = 1;
        while (n-- > 0) {
            b += a; 
            a = b - a;   //a为原来的b
        }
        return a;
	}
	/*
	 * 递归，超时
	 */
	public int climbStairs2(int n){
		if(n<=1)
			return 1;
		int[]d=new int[n];
		d[0]=1;d[1]=2;
		for(int i=2;i<n;i++){
			d[i]=d[i-1]+d[i-2];
		}
		return d[n-1];
	}
	public static void main(String[]args){
		System.out.println(new Solution().climbStairs(44));
	}
}

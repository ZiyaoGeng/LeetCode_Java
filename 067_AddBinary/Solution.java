
/*
 * 法1：
 * 通过异或进行判断进位、不进位各种情况
 * 法2：
 * 可以通过对位数少的进行前面补0，各个位数及进位情况判断：
 *  int aa = a.charAt(i) - '0';  
    int bb = b.charAt(i) - '0';  
    result += (aa + bb + tmp) % 2; //数 
    tmp = (aa + bb + tmp) / 2;//进位  
 */
public class Solution {
	public String addBinary(String a, String b) {
		StringBuilder s=new StringBuilder();
		String s1="";
		char c='0';
		if(a.length()<b.length()){
			s1=a;
			a=b;
			b=s1; 
		}
		for(int i=1;i<=a.length();i++){
			if(i<=b.length()){
			if((a.charAt(a.length()-i)^b.charAt(b.length()-i)^c)=='0'){ //0情况
				if((a.charAt(a.length()-i)=='1')||b.charAt(b.length()-i)=='1') //进位
					c='1';
				else c='0'; //不进位
				s.append("0");
			}
			else{
				if((a.charAt(a.length()-i)=='1')&&b.charAt(b.length()-i)=='1'&&c=='1') //1情况
					c='1';  //进位
				else c='0';  //不进位
				s.append("1");
			}
		}
			else{
				if((a.charAt(a.length()-i)=='1')&&c=='1'){
					s.append("0");
					c='1';
				}
				else{
					if(c=='1'){
						s.append("1");
						c='0';
					}
					else
					s.append(a.charAt(a.length()-i));
				}
			}
		}
		if(c=='1')
			s.append("1");
		return s.reverse().toString();
	}
}

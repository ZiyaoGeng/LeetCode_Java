
/*
 * ��1��
 * ͨ���������жϽ�λ������λ�������
 * ��2��
 * ����ͨ����λ���ٵĽ���ǰ�油0������λ������λ����жϣ�
 *  int aa = a.charAt(i) - '0';  
    int bb = b.charAt(i) - '0';  
    result += (aa + bb + tmp) % 2; //�� 
    tmp = (aa + bb + tmp) / 2;//��λ  
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
			if((a.charAt(a.length()-i)^b.charAt(b.length()-i)^c)=='0'){ //0���
				if((a.charAt(a.length()-i)=='1')||b.charAt(b.length()-i)=='1') //��λ
					c='1';
				else c='0'; //����λ
				s.append("0");
			}
			else{
				if((a.charAt(a.length()-i)=='1')&&b.charAt(b.length()-i)=='1'&&c=='1') //1���
					c='1';  //��λ
				else c='0';  //����λ
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

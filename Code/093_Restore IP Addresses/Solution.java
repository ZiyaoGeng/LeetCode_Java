import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String>list=new ArrayList<>();
        if(s.length()<4||s.length()>12)
            return list;
        String ip="";
        String tem="";
        String temp="";
        for(int i=1;i<=(s.length()<5?1:(s.length()>5?3:2));i++){
            if(i!=1&&(Integer.valueOf(s.substring(0,i))<Math.pow(10,i-1)||
                    Integer.valueOf(s.substring(0,i))>255))
                continue;
            ip=s.substring(0,i)+".";
            for(int j=1;j<=(s.length()-i<4?1:(s.length()-i>4?3:2));j++){
                if(j!=1&&(Integer.valueOf(s.substring(i,i+j))<Math.pow(10,j-1)
                        ||Integer.valueOf(s.substring(i,i+j))>255))
                    continue;
                tem=ip;
                ip+=s.substring(i,i+j)+".";
                for(int k=1;k<=(s.length()-i-j<3?1:(s.length()-i-j>3?3:2));k++){
                    if((k!=1&&(Integer.valueOf(s.substring(i+j,i+j+k))<Math.pow(10,k-1)||
                            Integer.valueOf(s.substring(i+j,i+j+k))>255))||
                            (s.length()-i-j-k!=1&&
                                    (Integer.valueOf(s.substring(i+j+k,s.length()))<
                                    Math.pow(10,s.length()-i-j-k-1)||
                            Integer.valueOf(s.substring(i+j+k,s.length()
                            ))>255)))
                        continue;
                    temp=ip;
                    ip+=s.substring(i+j,i+j+k)+"."+s.substring(i+j+k,s.length());
                    list.add(ip);
                    ip=temp;
                }
                ip=tem;
            }
        }
        return list;
    }
}

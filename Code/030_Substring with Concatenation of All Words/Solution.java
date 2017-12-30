import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer>list=new ArrayList<>();
        if(s.equals("")||words.length==0)
            return list;
        HashMap<String,Integer>map=new HashMap<>();
        HashMap<String,Integer>clone=new HashMap<>();
        for(int i=0;i<words.length;i++){
            if(map.containsKey(words[i]))
                map.put(words[i],map.get(words[i])+1);
            else
                map.put(words[i],1);
        }
        clone=(HashMap)map.clone(); //深度拷贝，空间换时间
        int len=words[0].length();
        for(int i=0;i<=s.length()-words.length*len;i++){
            String str=s.substring(i,i+len);
            int k=i;
            int counter=0;
            while(map.containsKey(str)&&map.get(str)>0){
                map.put(str,map.get(str)-1);
                counter++;
                k+=len;
                if(k+len>s.length())
                    break;
                str=s.substring(k,k+len);
            }
            if(counter==words.length)
                list.add(i);
            if(counter>0)
                map=(HashMap)clone.clone();
            }
            return list;
        }
}

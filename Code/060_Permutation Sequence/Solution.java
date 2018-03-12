import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String getPermutation(int n, int k) {
        if(n<1||k<1)
            return "";
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++)
            list.add(i);
        String s ="";
        int z=n;
        k=k-1;
        for (int i = 0; i < z-1; i++) {
            int group = fac(n) / n;
            int t =k / group;
            k=k%group;
            s+=(list.get(t));
            list.remove(list.get(t));
            n--;
        }
        s+=list.get(0);
        return s;
    }
    public int fac(int n){
        if(n==1)
            return 1;
        return n*fac(n-1);
    }
}


import java.util.HashSet;
import java.util.Set;

class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val=val;
    }
}
public class Solution {
    public int numComponents(ListNode head, int[] G) {
        Set<Integer>set=new HashSet<>();
        for(int i:G)
            set.add(i);
        ListNode p=head;
        int count=0;
        boolean flag=false;
        while(p!=null){
            if(set.contains(p.val))
                flag=true;
            else{
                if(flag==true) {
                    count++;
                    flag=false;
                }
            }
            p=p.next;
        }
        if(flag==true)
            count++;
        return count;
    }
}

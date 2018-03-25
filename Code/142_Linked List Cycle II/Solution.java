import java.util.ArrayList;
import java.util.List;

class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val=val;
        next=null;
    }
}
public class Solution {
    public ListNode detectCycle(ListNode head) {
        List<ListNode>list=new ArrayList<>();
        if(head==null)
            return head;
        ListNode  p=head;
        while (!list.contains(p)&&p!=null){
            list.add(p);
            p=p.next;
        }
        if(p==null)
            return null;
        return p;
    }
}

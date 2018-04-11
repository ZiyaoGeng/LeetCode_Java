import java.util.ArrayList;
import java.util.List;

class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val=val;
    }
}
public class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list=new ArrayList<>();
        ListNode p=head;
        while(p!=null){
            list.add(p.val);
            p=p.next;
        }
        ListNode q=reverse(head);
        int i=0;
        while(q!=null){
            if(q.val!=list.get(i))
                return false;
            i++;
            q=q.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head){
        ListNode p=head;
        ListNode front=null;
        while(p!=null){
            ListNode succ=p.next;
            p.next=front;
            front=p;
            p=succ;
        }
        return front;
    }
}

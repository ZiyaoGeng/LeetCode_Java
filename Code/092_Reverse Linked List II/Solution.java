import java.util.List;
import java.util.Scanner;

class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val=val;
    }
}
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null) return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        for(int i = 0; i<m-1; i++)
            pre = pre.next;
        ListNode start = pre.next;
        ListNode then = start.next;
        for(int i=0; i<n-m; i++)
        {
            start.next = then.next;
            then.next = pre.next;
            pre.next = then;
            then = start.next;
        }
        //1->2->3->4->5
        //1->3->2->4->5
        //1->4->3->2->5
        return dummy.next;
    }
}

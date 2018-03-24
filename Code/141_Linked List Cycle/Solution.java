/*
  1-->2-->3-->5
      |       |
      ---------
 */
class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val=val;
        next=null;
    }
}
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null)
            return false;
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null&&fast.next!=null){
            if(fast==slow)
                return true;
            else {
                slow = slow.next;
                fast = fast.next.next;
            }
        }
        return false;
    }
}

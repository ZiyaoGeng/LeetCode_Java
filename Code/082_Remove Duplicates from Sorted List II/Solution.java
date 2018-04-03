
class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val=val;
    }
}
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode p = new ListNode(0);
        p.next = head;
        ListNode pre = p;
        ListNode cur = head;
        while (cur != null) {
            while (cur.next!=null&&cur.val==cur.next.val){
                cur = cur.next;
            }
            if (pre.next == cur) {
                pre = pre.next;
            } else {
                pre.next = cur.next;
            }
            cur = cur.next;
        }
        return p.next;
    }
}

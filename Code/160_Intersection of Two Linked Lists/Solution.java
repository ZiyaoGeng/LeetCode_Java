
class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val=val;
    }
}
public class Solution {
    public ListNode getIntersectionNode
            (ListNode headA, ListNode headB) {
        if(headA==null||headB==null)
            return null;
        ListNode A=headA;
         ListNode B=headB;
        while(A!=B){
            A=A==null?headB:A.next;
            B=B==null?headA:B.next;
        }
        return A;
    }
    public static void main(String[]args){
        ListNode A=new ListNode(1);
        A.next=new ListNode(2);
        A.next.next=new ListNode(3);
        ListNode B=A.next;
        new Solution().getIntersectionNode(A,B);
    }
}


class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val=val;
    }
}
public class Solution {
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode[]nodes=new ListNode[k];
        int count=num(root);
        int n1=count/k,n2=count%k;
        ListNode p=root;
        for(int i=0;i<k;i++){
            ListNode node=new ListNode(0);
            ListNode q=node;
            if(p!=null) {
                for (int j = 0; j < n1; j++) {
                    q.next = new ListNode(p.val);
                    q = q.next;
                    p = p.next;
                }
                if (i < n2) {
                    q.next = new ListNode(p.val);
                    p = p.next;
                }
            }
            nodes[i]=node.next;
        }
        return nodes;
    }
    public int num(ListNode head){
        ListNode p=head;
        int count=0;
        while(p!=null){
            count++;
            p=p.next;
        }
        return count;
    }
}

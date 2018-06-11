
class ListNode {
    int val;
    ListNode next;
    public ListNode(int val) {
        this.val = val;
    }
}
public class MyQueue {
    ListNode root;
    ListNode p;
    int length;
    /** Initialize your data structure here. */
    public MyQueue() {
        root=new ListNode(0);
        p=root;
        length =0;
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        p.next=new ListNode(x);
        p=p.next;
        length++;
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(root.next==null)
            return -1;
        int d=root.next.val;
        root.next=root.next.next;
        length--;
        this.p=root;
        while (p.next!=null)
            p=p.next;
        return d;
    }

    /** Get the front element. */
    public int peek() {
        return root.next.val;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(root.next==null)
            return true;
        return false;
    }
}


public class MyStack {
    class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val=val;
        }
    }
    ListNode root;
    ListNode p;
    /** Initialize your data structure here. */
    public MyStack() {
        root=new ListNode(0);
        p =root;
    }

    /** Push element x onto stack. */
    public void push(int x) {
        p.next=new ListNode(x);
        p = p.next;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        ListNode front=root;
        while (front.next!=null&&front.next.next!=null)
            front=front.next;
        int num=p.val;
        p=front;
        p.next=null;
        return num;
    }

    /** Get the top element. */
    public int top() {
        return p.val;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        if(root.next==null)
            return true;
        return false;
    }
}

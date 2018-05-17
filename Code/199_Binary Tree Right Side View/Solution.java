import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val){
        this.val=val;
    }
}
public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        if(root==null)
            return list;
        Queue<TreeNode>queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            TreeNode node = queue.peek();
            list.add(node.val);
            for(int i=0;i<size;i++) {
                if(queue.peek().right!=null)
                    queue.offer(queue.peek().right);
                if(queue.peek().left!=null)
                    queue.offer(queue.peek().left);
                queue.remove();
            }
        }
        return list;
    }
}

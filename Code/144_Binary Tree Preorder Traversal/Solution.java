import java.util.ArrayList;
import java.util.List;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val){
        this.val=val;
    }
}
public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        if(root==null)
            return list;
        preorder(root,list);
        return list;
    }
    public void preorder(TreeNode root,List<Integer>list){
        list.add(root.val);
        if(root.left!=null)
            preorder(root.left,list);
        if(root.right!=null)
            preorder(root.right,list);
    }
}

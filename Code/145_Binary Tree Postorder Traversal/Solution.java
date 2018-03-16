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
    public List<Integer> postorderTraversal(TreeNode root){
        List<Integer>list=new ArrayList<>();
        if(root==null)
            return list;
        postorder(root,list);
        return list;
    }
    public void postorder(TreeNode root,List<Integer>list){
        if(root.left!=null)
            postorder(root.left,list);
        if(root.right!=null)
            postorder(root.right,list);
        list.add(root.val);
    }
}

import java.util.ArrayList;
import java.util.List;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val){
        this.val=val;
        left=null;
        right=null;
    }
}
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        if(root==null)
            return list;
        inorder(root,list);
        return list;
    }
    public void inorder(TreeNode root,List<Integer>list){
        if(root.left!=null)
            inorder(root.left,list);
        list.add(root.val);
        if(root.right!=null)
            inorder(root.right,list);
    }
    public static void main(String[]args){
        TreeNode root=new TreeNode(1);
        root.right=new TreeNode(2);
        root.right.left=new TreeNode(3);
        System.out.println(new Solution().inorderTraversal(root));
    }
}

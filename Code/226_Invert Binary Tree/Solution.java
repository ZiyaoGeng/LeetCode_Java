
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val){
        this.val=val;
    }
}
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root!=null)
        help(root);
        return root;
    }
    public void help(TreeNode root){
        TreeNode tmp=root.left;
        root.left=root.right;
        root.right=tmp;
        if(root.left!=null)
            help(root.left);
        if(root.right!=null)
            help(root.right);
    }
}

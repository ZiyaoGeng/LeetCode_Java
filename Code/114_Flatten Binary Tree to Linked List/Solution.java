
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val){
        this.val=val;
    }
}
public class Solution {
    public void flatten(TreeNode root) {
        if (root == null) return;
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = null;
        flatten(left);
        flatten(right);
        root.right = left;
        TreeNode cur = root;
        while (cur.right != null) cur = cur.right;
        cur.right = right;
    }
}

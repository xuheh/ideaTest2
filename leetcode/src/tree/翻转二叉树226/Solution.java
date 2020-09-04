package tree.翻转二叉树226;


/**
 * @Author: xhh
 * @Date: 2020/7/22 21:56
 * @Version 1.0
 */
public class Solution {

    public TreeNode invertTree(TreeNode root) {

        if (root == null) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;

    }


}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
package tree.二叉搜索树的最近公共祖先235;

/**
 * @Author: xhh
 * @Date: 2020/7/23 14:01
 * @Version 1.0
 */
public class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null) {
            return null;
        }

        if (root.val > p.val && root.val > q.val ) {
            return lowestCommonAncestor(root.left, p, q);
        }

        if (root.val < p.val && root.val < q.val ) {
            return lowestCommonAncestor(root.right, p, q);
        }

        return root;
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

package tree.路径总和112;

/**
 * @Author: xhh
 * @Date: 2020/7/22 22:10
 * @Version 1.0
 */
public class Solution {

    /**
     * 题目的要求是跟到叶子节点
     * @param root
     * @param sum
     * @return
     */
    public boolean hasPathSum(TreeNode root, int sum) {

        if (root == null) {
            return false;
        }
        // 递归的终止条件是当前的节点为叶子节点，即左子树和右子树都为空。
        if (root.left == null && root.right == null) {
            return root.val == sum;
        }

        if (root.left != null) {
            if (hasPathSum(root.left, sum - root.val)) {
                return true;
            }
        }

        if (root.right != null) {
            if (hasPathSum(root.right, sum - root.val)) {
                return true;
            }
        }

        return false;

    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

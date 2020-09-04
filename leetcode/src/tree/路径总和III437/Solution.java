package tree.路径总和III437;

/**
 * @Author: xhh
 * @Date: 2020/7/23 11:58
 * @Version 1.0
 */
public class Solution {

    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        int res = findPath(root, sum);
        res += pathSum(root.left, sum);
        res += pathSum(root.right, sum);
        return res;

    }

    private int findPath(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        int res = 0;
        if (sum - root.val == 0) {
            res++;
        }
        res += findPath(root.left , sum - root.val );
        res += findPath(root.right, sum - root.val);
        return res;
    }

}
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}
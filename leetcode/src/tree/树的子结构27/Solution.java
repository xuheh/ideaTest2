package tree.树的子结构27;

import tree.TreeNode;

/**
 * @Author: xhh
 * @Date: 2020/9/8 21:59
 * @Version 1.0
 */
public class Solution {

    public boolean isSubStructure(TreeNode A, TreeNode B) {

        if (A == null || B == null) {
            return true;
        }
        if (!dfs(A, B)) {
            return isSubStructure(A.left, B) || isSubStructure(A.right, B);
        }
        return true;


    }


    private boolean dfs(TreeNode a, TreeNode b) {

        if (b.val == a.val) {
            if (b.right == null && b.left == null) {
                return true;
            }
            if (b.left != null || a.left == null) {
                return false;
            }

            if (b.left != null && a.left != null) {
                return dfs(b.left, a.left);
            }
            if (b.right != null && a.right != null) {
                return dfs(b.right, a.right);
            }
            return false;
        }
        else {
            return false;
        }


    }

}

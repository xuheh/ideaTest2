package tree.验证二叉搜索树98;

import tree.TreeNode;

/**
 * @Author: xhh
 * @Date: 2020/8/9 17:28
 * @Version 1.0
 */
public class Solution {

    public boolean isValidBST(TreeNode root) {

        if (root.left != null && root.left.val < root.val) {
            return isValidBST(root.left);
        }
        else if (root.left != null && root.left.val >= root.val) {
            return false;
        }

        else {
            return true;
        }







    }

}




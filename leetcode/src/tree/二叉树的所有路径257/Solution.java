package tree.二叉树的所有路径257;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xhh
 * @Date: 2020/9/4 15:06
 * @Version 1.0
 */
public class Solution {



    public List<String> binaryTreePaths(TreeNode root) {

        List<String> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        dfs(root,new StringBuilder(), res);
        return res;

    }

    private void dfs(TreeNode root, StringBuilder string, List<String> res) {

        if (root != null) {
            StringBuilder stringBuilder = new StringBuilder(string);
            stringBuilder.append(root.val);
            if (root.left == null && root.right == null) {
                res.add(stringBuilder.toString());
            }
            stringBuilder.append("->");
            if (root.left != null) {

                dfs(root.left, stringBuilder, res);
            }

            if (root.right != null) {
                dfs(root.right, stringBuilder, res);
            }

        }

    }

}

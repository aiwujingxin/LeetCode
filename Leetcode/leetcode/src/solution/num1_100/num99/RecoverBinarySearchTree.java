package solution.num1_100.num99;

import baseclass.TreeNode;

/**
 * @program: LeetCode
 * @description:
 * @author: jingxin Wu
 * @create: 2018-10-07 12:30
 **/

public class RecoverBinarySearchTree {

    TreeNode first = null;
    TreeNode second = null;
    TreeNode prev = null;

    public void recoverTree(TreeNode root) {
        if (root == null) return;
        helper(root);
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }

    private void helper(TreeNode root) {
        if (root == null) return;
        helper(root.left);

        if (prev != null && prev.val >= root.val) {
             if (first == null) first = prev;
             second = root;
        }
        prev = root;
        helper(root.right);
    }
}

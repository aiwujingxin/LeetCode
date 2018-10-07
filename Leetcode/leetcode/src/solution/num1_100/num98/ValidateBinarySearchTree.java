package solution.num1_100.num98;

import baseclass.TreeNode;

/**
 * @program: LeetCode
 * @description:
 * @author: jingxin Wu
 * @create: 2018-10-07 14:59
 **/

public class ValidateBinarySearchTree {

    /**
     * time : O(n) , space:O(n)
     *
     * */
    public boolean isValidBST(TreeNode root) {
        if (root == null) return false;
        return helper(root, null, null);
    }

    private boolean helper(TreeNode root, Integer min, Integer max) {
        if (root == null) return true;
        if (min != null && root.val <= min) return false;
        if (max != null && root.val >= max) return false;
        return helper(root.left, min, root.val) && helper(root.right, root.val, max);
    }
}

package Algorithms;

import java.util.HashSet;
import java.util.Set;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Problem_653_Two_Sum_IV_Input_Is_A_BST {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> value_set = new HashSet<>();
        return findTarget(root, k, value_set);
    }

    private boolean findTarget(TreeNode root, int k, Set<Integer> value_set) {
        if (null == root)
            return false;
        if (value_set.contains(k - root.val))
            return true;
        value_set.add(root.val);
        return findTarget(root.left, k, value_set) || findTarget(root.right, k, value_set);
    }
}

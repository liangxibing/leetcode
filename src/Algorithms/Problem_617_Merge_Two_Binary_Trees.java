package Algorithms;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Problem_617_Merge_Two_Binary_Trees {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (null == t1) return t2;
        if (null == t2) return t1;
        TreeNode result = new TreeNode(t1.val + t2.val);
        result.left = mergeTrees(t1.left, t2.left);
        result.right = mergeTrees(t1.right, t2.right);
        return result;
    }
}

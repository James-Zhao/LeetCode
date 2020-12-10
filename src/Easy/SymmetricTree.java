package Easy;

/**
 * NO.101
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        } else {
            return isSymmetricTreeHelp(root.left, root.right);
        }
    }

    private boolean isSymmetricTreeHelp(TreeNode left, TreeNode right) {
        if (left == null || right == null) {
            return left == right;
        }
        if (left.val != right.val) {
            return false;
        }
        return isSymmetricTreeHelp(left.left, right.right) && isSymmetricTreeHelp(left.right, right.left);
    }
}

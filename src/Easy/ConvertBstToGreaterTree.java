package Easy;

/**
 * NO.538
 */
public class ConvertBstToGreaterTree {
    public TreeNode convertBST(TreeNode root) {
        dfs(root, 0);
        return root;
    }
    public int dfs(TreeNode root, int val) {
        if(root == null) return val;
        int right = dfs(root.right, val);
        int left = dfs(root.left, root.val + right);
        root.val = root.val + right;
        return left;
    }
}

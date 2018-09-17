package Easy;

/**
 * Created by zhaosi on 17-6-26.
 */
public class ConstructStringFromBinaryTree {
    public String tree2str(TreeNode t) {
        if (t == null) return "";
        StringBuilder sb = new StringBuilder();

        sb.append(t.val);

        if (t.left != null) {
            sb.append("(");
            sb.append(tree2str(t.left));
            sb.append(")");
        } else {
            if (t.right != null) {
                sb.append("(");
                sb.append(")");
            }
        }
        if (t.right != null) {
            sb.append("(");
            sb.append(tree2str(t.right));
            sb.append(")");
        }
        return sb.toString();
    }
}

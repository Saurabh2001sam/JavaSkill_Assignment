

public class CountNode {
    public class TreeNode {

        int data;
        TreeNode left, right;

        TreeNode(int item) {
            data = item;
            left = right = null;
        }
    }

    TreeNode root;

    int findMax(TreeNode root) {
        if (root == null)
            return Integer.MIN_VALUE;

        int res = root.data;
        int lres = findMax(root.left);
        int rres = findMax(root.right);

        if (lres > res)
            res = lres;
        if (rres > res)
            res = rres;
        return res;
    }

    public static void main(String[] args) {
        CountNode tree = new CountNode();
        tree.root = new TreeNode(2);
        tree.root.left = new TreeNode(7);
        tree.root.right = new TreeNode(5);
        tree.root.left.right = new TreeNode(6);
        tree.root.left.right.left = new TreeNode(1);
        tree.root.left.right.right = new TreeNode(11);
        tree.root.right.right = new TreeNode(9);
        tree.root.right.right.left = new TreeNode(4);

        System.out.println("Maximum element is " + tree.findMax(root));
    }
}
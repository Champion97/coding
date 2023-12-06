class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class TreeReflection {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        // Swap left and right subtrees
        TreeNode temp = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(temp);

        return root;
    }

    public static void printTree(TreeNode root) {
        if (root == null) {
            return;
        }

        // In-order traversal to print the tree
        printTree(root.left);
        System.out.print(root.val + " ");
        printTree(root.right);
    }

    public static void main(String[] args) {
        // Example usage:
        TreeNode originalTree = new TreeNode(1);
        originalTree.left = new TreeNode(2);
        originalTree.right = new TreeNode(3);
        originalTree.left.left = new TreeNode(4);
        originalTree.left.right = new TreeNode(5);

        TreeReflection treeReflection = new TreeReflection();
        TreeNode reflectedTree = treeReflection.mirrorTree(originalTree);

        System.out.println("Original Tree:");
        printTree(originalTree);

        System.out.println("\nReflected Tree:");
        printTree(reflectedTree);
    }
}


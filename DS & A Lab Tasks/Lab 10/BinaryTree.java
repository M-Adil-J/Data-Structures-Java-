public class BinaryTree {
    TreeNode root;

    public void insert(int value) {
        root = inserting(root, value);
    }

    private TreeNode inserting(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }
        if (value < root.value) {
            root.left = inserting(root.left, value);
        } else if (value > root.value) {
            root.right = inserting(root.right, value);
        }
        return root;
    }

    public void preOrder() {
        preOrderTraversal(root);  }
    
    private void preOrderTraversal(TreeNode root) {
        if (root != null) {
            System.out.print(root.value + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }  }
    
    public void postOrder() {
        postOrderTraversal(root);
    }
    
    private void postOrderTraversal(TreeNode root) {
        if (root != null) {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.value + " ");
        }  }

    public void inOrder() {
        inOrdertraversal(root); }

    private void inOrdertraversal(TreeNode root) {
        if (root != null) {
            inOrdertraversal(root.left);
            System.out.print(root.value + " ");
            inOrdertraversal(root.right);
        }  }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("In-order traversal of the binary tree:");
        tree.inOrder();

        System.out.println("\nPre-order traversal of the binary tree:");
        tree.preOrder();

        System.out.println("\nPost-order traversal of the binary tree:");
        tree.postOrder();
    } }
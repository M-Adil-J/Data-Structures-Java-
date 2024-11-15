public class BinaryTree {
    
    Node root;

    // Constructors
    BinaryTree(int key) {
        root = new Node(key);
    }

    BinaryTree() {
        root = null;
    } 

    public void addNode(int data) {
        // insert elements in a tree so that left subtree of parent should contain smaller values
        // and right sub-tree should contain larger than its parent.
        // handle all possible exceptions/errors
    } 

    public boolean searchNode(int data) {
        // search data from Binary Tree and return true/false, check all possible conditions
        // handle all possible exceptions/errors
    } 

    public int countOfNodes(Node root) {
        // return the number of nodes in a tree
    }

    public int height(Node root) {
        // return the height/depth of the tree
    } 

    public static void main(String[] args) {
        // Test the main method by creating node for different multiple nodes with children
    }
}
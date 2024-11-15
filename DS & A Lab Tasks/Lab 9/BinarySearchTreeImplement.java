public class BinarySearchTreeImplement {

    static class Node {
        int value;
        Node left,right;

        public Node(int value) {
            this.value=value;
        }}

    static class BinarySearchTree{ 

        public Node addNode(Node root, int val) {
            if (root == null){
                return new Node(val);
            }
            if (val < root.value) {
                root.left = addNode(root.left, val);
            } else {
                root.right = addNode(root.right, val);
            }
            return root; }

        public boolean searchNode(Node root, int data) {
            while (root != null) {
                if (root.value == data) return true;
                root = (data < root.value) ? root.left : root.right;
            }
            return false; }

        public void preorderTraversal(Node root) {
            if (root != null) {
                System.out.print(root.value + " ");
                preorderTraversal(root.left);
                preorderTraversal(root.right);
            }
        }

        public int countOfNodes(Node root) {
            return (root == null) ? 0 : 1 + countOfNodes(root.left) + countOfNodes(root.right); }

        public int heightofTree(Node root) {
            return (root == null) ? 0 : 1 + Math.max(heightofTree(root.left), heightofTree(root.right)); }

        public int minNumber(Node root) {
            return (root.left == null) ? root.value : minNumber(root.left); }  } 

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        Node root = null;

        int[] values = {12, 14, 13, 15, 17, 20, 16, 19, 10, 18, 11};
        for (int val : values) {
            root = tree.addNode(root, val);
        }

        tree.preorderTraversal(root);
        System.out.println();

        System.out.println("search for 15: " + tree.searchNode(root, 18));
        System.out.println("Total Nodes that are present are " + tree.countOfNodes(root));
        System.out.println("Height of tree is: " + tree.heightofTree(root));
        System.out.println("The Minimum Number present in the Tree is: " + tree.minNumber(root));
    }
}

public class returnSum {

    public static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.left = null;
        }
    }

    public static class Tree {

        static int idx = -1;

        public static Node BuildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);
            return newNode;
        }
    }

    public static void main(String[] args) {
        int[] nodes = {2, 6, 8, -1, -1, 4, -1, -1, 3, 5, -1, -1, 7, -1, -1};
        Node root = Tree.BuildTree(nodes);
        System.out.println(root.data);
    }
}

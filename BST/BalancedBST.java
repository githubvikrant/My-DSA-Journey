
import java.rmi.registry.LocateRegistry;
import java.util.LinkedList;
import java.util.Queue;

public class BalancedBST {

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Info {

        boolean isBST;
        int size;
        int min;
        int max;

        public Info(boolean isBST, int size, int min, int max) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;

        }
    }

    public static void main(String[] args) {

        /*
                 4
                / \
               2   6
              / \ / \
             1  3 5  7
        
         */
        int nodes[] = {1, 2, 3};
        Node root = balancedTree(nodes, 0, 2);
        // inorder(root);
        levelOrder(root);
        largestBST(root);
        System.out.println("largst BST size : " + maxBST);
    }

    static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    static Node balancedTree(int[] nodes, int si, int ei) {
        if (si > ei) {
            return null;
        }

        int midIdx = (si + ei) / 2;
        Node root = new Node(nodes[midIdx]);
        root.left = balancedTree(nodes, si, midIdx - 1);
        root.right = balancedTree(nodes, midIdx + 1, ei);
        return root;
    }

    //level order traversal
    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    public static int maxBST = 0;

    public static Info largestBST(Node root) {

        if (root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);

        int size = leftInfo.size + rightInfo.size + 1;
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));

        if (root.data <= leftInfo.max || root.data >= rightInfo.min) {
            return new Info(false, size, min, max);
        }

        if (leftInfo.isBST && rightInfo.isBST) {
            maxBST = Math.max(maxBST, size);
            return new Info(true, size, min, max);
        }
        return new Info(false, size, min, max);
    }
}

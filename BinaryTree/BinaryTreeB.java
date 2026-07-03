
import java.util.*;

public class BinaryTreeB {

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = CreateBinaryTree.BuildTtree(nodes);
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        levelOrder(root);
        System.out.println();
        int height = Height(root);
        System.out.println("height:" + height);
        System.out.println(nodeCount(root));
        System.out.println("node sum :" + nodeSum(root));

    }

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

    static class CreateBinaryTree {

        static int idx = -1;

        public static Node BuildTtree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]); //preorder
            newNode.left = BuildTtree(nodes);
            newNode.right = BuildTtree(nodes);
            return newNode;
        }
    }

    // tree traversal
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
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

    public static int Height(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = Height(root.left);
        int rh = Height(root.right);
        return Math.max(lh, rh) + 1;
    }

    public static int nodeCount(Node root) {
        if (root == null) {
            return 0;
        }
        int l = nodeCount(root.left);
        int r = nodeCount(root.right);

        return l + r + 1;
    }

    public static int nodeSum(Node root) {
        if (root == null) {
            return 0;
        }
        int l = nodeSum(root.left);
        int r = nodeSum(root.right);

        return l + r + root.data;
    }
}

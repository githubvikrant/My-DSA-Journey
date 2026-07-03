
public class distBtwNodes {

    /*
               1
              / \
             2   3
            / \   \ 
           4   5   6    
     */

    public static void main(String[] args) {
        System.out.println("Finding the distance between the two nodes");
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = CreateBinaryTree.BuildTtree(nodes);
        preorder(root);
        int n1 = 4;
        int n2 = 6;
        System.out.println();
        int minDist = findMinDist(root, n1, n2);
        System.out.println(minDist);

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
    // find lowest common ancestor

    static Node findLCA(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftLCA = findLCA(root.left, n1, n2);
        Node rightLCA = findLCA(root.right, n1, n2);

        if (leftLCA == null) {
            return rightLCA;
        }
        if (rightLCA == null) {
            return leftLCA;
        }

        return root;
    }

    static int findMinDist(Node root, int n1, int n2) {
        Node lca = findLCA(root, n1, n2);
        return lcaDist(lca, n1) + lcaDist(lca, n2);
    }

    static int lcaDist(Node root, int n) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }
        int left = lcaDist(root.left, n);
        int right = lcaDist(root.right, n);

        if (left == -1 && right == -1) {
            return -1;
        }

        if (left == -1) {
            return right + 1;
        } else {
            return left + 1;
        }
    }
}

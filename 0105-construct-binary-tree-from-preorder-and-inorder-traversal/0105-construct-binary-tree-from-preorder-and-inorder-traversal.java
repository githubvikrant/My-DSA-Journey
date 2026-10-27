/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int preorderIdx = 0;
    HashMap<Integer,Integer> inorderMap = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preorderIdx = 0;
        inorderMap.clear();

        for(int i=0;i<inorder.length;i++){
            inorderMap.put(inorder[i],i);
        }
        return helper(preorder,0,inorder.length-1);
    }

    TreeNode helper(int[] preorder,int left , int right){
        if(left>right){
            return null;
        }

        int rootVal = preorder[preorderIdx++];
        TreeNode root = new TreeNode(rootVal);

        int mid = inorderMap.get(rootVal);

        root.left = helper(preorder,left,mid-1);
        root.right = helper(preorder,mid+1,right);

        return root;
    }
}
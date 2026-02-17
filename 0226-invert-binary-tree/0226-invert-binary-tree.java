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
    void swap(TreeNode a){
        if(a.right==null && a.left==null){
            return;
        }
        TreeNode temp=a.left;
        a.left=a.right;
        a.right=temp;
    }
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return root;
        }
        swap(root);
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
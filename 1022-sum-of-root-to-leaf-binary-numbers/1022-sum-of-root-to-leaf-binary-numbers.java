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
    int sum;
    void preOrder(int temp,TreeNode root){
        if(root==null){
            return;
        }
        temp=(temp<<1) | root.val;
        if(root.left==null && root.right==null){
            sum+=temp;
        }
        preOrder(temp,root.left);
        preOrder(temp,root.right);
    }
    public int sumRootToLeaf(TreeNode root) {
        preOrder(0,root);
        return sum;
    }
}
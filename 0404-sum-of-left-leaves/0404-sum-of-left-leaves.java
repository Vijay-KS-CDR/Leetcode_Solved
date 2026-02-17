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
    public int sumOfLeftLeaves(TreeNode root) {
        int sum=0;
        if(root==null){
            return 0;
        }
        Queue<TreeNode> q=new ArrayDeque<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode s=q.poll();
            if(s.left!=null){
                if(s.left.left==null && s.left.right==null){
                    sum+=s.left.val;
                }
                else{
                    q.offer(s.left);
                }
            }
            if(s.right!=null){
                q.offer(s.right);
            }

        }
        return sum;
    }
}
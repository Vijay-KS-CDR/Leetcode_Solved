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
    int ans;
    int max;
    void longestBottom(TreeNode root,int dis){
        if(root == null){
            return ;
        }
        if(root.left==null && root.right==null){
            if(dis>max || dis == 0){
                ans=root.val;
                System.out.println(ans);
                max=dis;
            }
            return;
        }
        longestBottom(root.left,dis+1);
        longestBottom(root.right,dis+1);
    }
    public int findBottomLeftValue(TreeNode root) {
        max=0;
        ans=0;
        longestBottom(root,0);
        return ans;
    }
}
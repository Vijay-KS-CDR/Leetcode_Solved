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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> out=new ArrayList<>();
        Queue<TreeNode> q=new ArrayDeque<>();
        if(root==null){
            return out;
        }
        q.add(root);
        int k=0;
        while(!q.isEmpty()){
            int n=q.size();
            ArrayList<Integer> lst=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode s=q.poll();
                lst.add(s.val);
                if(s.left!=null){
                    q.add(s.left);
                }  
                if(s.right!=null){
                    q.add(s.right);
                }   
            }
            if(k%2==0){
                out.add(lst);
            }
            else{
                Collections.reverse(lst);
                out.add(lst);
            }
            k++;
        }
        return out;
    }
}
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
        List<List<Integer>> lst = new ArrayList<>();
        if(root==null) return lst ;
        boolean is = true;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            int size = q.size();
            for(int i = 0;i < size; i++){
                TreeNode s = q.poll();
                if(is){
                    temp.add(s.val);
                }else{
                    temp.add(0,s.val);
                }
                if(s.left!=null) q.offer(s.left);
                if(s.right!=null) q.offer(s.right);
            }
            is=!is;
            lst.add(temp);
        }
        return lst;
    }
}
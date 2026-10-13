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
    void bst(TreeNode root,HashMap<Integer,Integer> map){
        if(root==null){
            return;
        }
        map.put(root.val,map.getOrDefault(root.val,0)+1);
        bst(root.left,map);
        bst(root.right,map);
    }
    public int[] findMode(TreeNode root) {
        HashMap<Integer,Integer> map = new HashMap<>();
        bst(root,map);
        int max = 0;
        for(int i:map.values()){
            max=Math.max(max,i);
        }
        ArrayList<Integer> lst = new ArrayList<>();
        for(int i:map.keySet()){
            if(map.get(i)==max){
                lst.add(i);
            }
        }
        int []ans = new int[lst.size()];
        int j=0;
        for(int i:lst){
            ans[j++]=i;
        }
        return ans;
    }
}
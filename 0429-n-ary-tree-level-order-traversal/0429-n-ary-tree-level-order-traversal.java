/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>>ans= new ArrayList<>();
        if(root==null) return ans;
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            List<Integer> temp= new ArrayList<>();
            for(int i=0;i<n;i++){
                Node cur=q.poll();
                temp.add(cur.val);
                List<Node> list=cur.children;
                if(list.size()==0) continue;
                for(Node s:list){
                    q.add(s);
                }
            }
            ans.add(temp);
        }
        return ans;
    }
}
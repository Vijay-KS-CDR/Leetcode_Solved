class Solution {
    public void permutation(int arr[],int idx,boolean used[],ArrayList<Integer>cur,List<List<Integer>> ans){
        if(cur.size()==arr.length){
            ans.add(new ArrayList<>(cur));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(used[i]==true){
                continue;
            }
            used[i]=true;
            cur.add(arr[i]);
            permutation(arr,idx+1,used,cur,ans);
            cur.remove(cur.size()-1);
            used[i]=false;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        boolean used[]=new boolean[nums.length];
        permutation(nums,0,used,new ArrayList<>(),ans);
        return ans; 
    }
}
class Solution {
    HashSet<ArrayList<Integer>> set=new HashSet<>();
    void generate(int idx,int []arr,ArrayList<Integer> cur){
        if(idx==arr.length){
            set.add(new ArrayList<>(cur));
            return;
        }
        cur.add(arr[idx]);
        generate(idx+1,arr,cur);
        cur.remove(cur.size()-1);
        generate(idx+1,arr,cur);
    }
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        generate(0,nums,new ArrayList<>());
        for(ArrayList<Integer> s:set){
            ans.add(s);
        }
        return ans;
    }
}
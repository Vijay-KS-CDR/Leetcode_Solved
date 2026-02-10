class Solution {
    HashSet<ArrayList<Integer>> set=new HashSet<>();
    public void generate(int idx,int arr[],ArrayList<Integer> cur){
        if(arr.length==idx){
            set.add(new ArrayList<>(cur));
            return;
        }
        cur.add(arr[idx]);
        generate(idx+1,arr,cur);
        cur.remove(cur.size()-1);
        generate(idx+1,arr,cur);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> lst=new ArrayList<>();
        generate(0,nums,new ArrayList<>());
        for(ArrayList<Integer> i:set){
            lst.add(i);
        }
        return lst;
    }
}
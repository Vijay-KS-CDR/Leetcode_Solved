class Solution {
    HashSet<List<Integer>> set=new HashSet<>();
    void generate(int[]arr,boolean visit[],List<Integer> lst){
        if(lst.size()==arr.length) {
            set.add(new ArrayList(lst));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(visit[i]==true) continue;
            visit[i]=true;
            lst.add(arr[i]);
            generate(arr,visit,lst);
            lst.remove(lst.size()-1);
            visit[i]=false;
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean visit[]=new boolean[nums.length];
        generate(nums,visit,new ArrayList<>());
        return new ArrayList<>(set);
    }
}
class Solution {
    HashSet<ArrayList<Integer>>set=new HashSet<>();
    List<List<Integer>> lst=new ArrayList<>();
    void combination(int arr[],int target,int idx,ArrayList<Integer> cur){
            if(target==0){
                set.add(new ArrayList<>(cur));
            return;
            }
            if(target<0 || idx==arr.length){
                return;
            }

        //take 
        cur.add(arr[idx]);
        combination(arr,target-arr[idx],idx,cur);

        cur.remove(cur.size()-1);

        combination(arr,target,idx+1,cur);


    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        combination(candidates,target,0,new ArrayList<>());
        for(ArrayList<Integer> s:set){
            lst.add(s);
        }
        return lst;
    }
}
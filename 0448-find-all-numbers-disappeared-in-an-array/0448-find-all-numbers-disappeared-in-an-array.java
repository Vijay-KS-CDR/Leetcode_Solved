class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> lst=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int s:nums){
            set.add(s);
        }
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
                lst.add(i);
            }
        }
        return lst;
    }
}
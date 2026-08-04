class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> lst = new ArrayList<Integer>();
        int min = Arrays.stream(nums).min().getAsInt();
        int max = Arrays.stream(nums).max().getAsInt();
        Set<Integer> set = new HashSet<>();
        for(int x:nums){
            set.add(x);
        }
        for(int i = min;i <= max ; i++){
            if(!set.contains(i)){
                lst.add(i);
            }
        }
        return lst;
    }
}
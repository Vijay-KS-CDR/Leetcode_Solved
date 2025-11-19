class Solution {
    public int findFinalValue(int[] nums, int key) {
        HashSet set=new HashSet();
        for(int i:nums){
            set.add(i);
        }
                int n=key;
                while(set.contains(n)){
                    n*=2;
                }
                return n;
    }
}
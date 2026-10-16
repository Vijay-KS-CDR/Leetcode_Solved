class Solution {
    public int sumCounts(List<Integer> nums) {
        int ans = 0;
       
           for(int j=0;j<nums.size();j++){
            HashSet<Integer> set = new HashSet();
               for(int k=j;k<nums.size();k++){
                    set.add(nums.get(k));
                    int a = set.size();
                    ans+=a*a;
               }
           }
        
        return ans;
    }
}
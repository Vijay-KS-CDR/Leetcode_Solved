class Solution {
    public int longestConsecutive(int[] nums) {
    if(nums.length==0) return 0;
        TreeSet<Integer> set=new TreeSet();
        for(int i:nums){
            set.add(i);
        }
        int max=0;
       for(int i:set){
            if(!set.contains(i-1)){
                int cur=i;
                int count=1;
                while(set.contains(cur+1)){
                    cur++;
                    count++;
                }
                max = Math.max(max,count);
            }
       }
       return max;
    }
}
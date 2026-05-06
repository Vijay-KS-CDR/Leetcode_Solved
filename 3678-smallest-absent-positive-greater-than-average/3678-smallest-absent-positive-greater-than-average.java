class Solution {
    public int smallestAbsent(int[] nums) {
        int sum = 0;
        for(int  i = 0 ; i < nums.length ; i++){
            sum+=nums[i];
        }
        int avg=sum/nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        for(int i=1;i<=101;i++){
            if(!set.contains(i) && i > avg){
                return i;
            }
        }
        return 0;
    }
}
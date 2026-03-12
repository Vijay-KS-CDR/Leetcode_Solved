class Solution {
    int atmostFinder(int k,int nums[]){
        Map<Integer,Integer> map=new HashMap<>();
        int count=0;
        int r=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            while(map.size()>k){
                map.put(nums[r],map.get(nums[r])-1);
                if(map.get(nums[r])==0){
                    map.remove(nums[r]);
                }
                r++;
            }
            count+=i-r+1;
        }
        return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atmostFinder(k,nums)-atmostFinder(k-1,nums);
    }
}
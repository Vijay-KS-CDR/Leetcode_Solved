class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int []ar=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int i=0;
        for(int key:map.keySet()){
            if(map.get(key)==2){
                ar[i++]=key;
            }
        }
        return ar;
    }
}
class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        }
        
        if(map.isEmpty()) return -1;

        int maxCount=0;
        int elem=0;
        for(Map.Entry<Integer,Integer> ent:map.entrySet()){
                int x=ent.getValue();
                int y=ent.getKey();
                if(x>maxCount || (maxCount==x && y<elem)){
                    elem=y;
                    maxCount=x;
                }
        }
        return elem;
    }
}
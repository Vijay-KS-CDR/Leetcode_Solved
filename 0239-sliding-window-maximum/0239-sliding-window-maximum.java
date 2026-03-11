class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> lst=new ArrayList<>();
        TreeMap<Integer,Integer> map=new TreeMap<>((a,b)->(b-a));
        for(int i=0;i<k;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        lst.add(map.firstKey());
        int l=0;
        for(int i=k;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            map.put(nums[l],map.get(nums[l])-1);
            if(map.get(nums[l])==0){
                map.remove(nums[l]);
            }
            lst.add(map.firstKey());
            l++;
        }
        int[]ans=new int[lst.size()];
        for(int i=0;i<lst.size();i++){
            ans[i]=lst.get(i);
        }
        return ans;
    }
}
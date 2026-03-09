class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        Queue<int[]> q=new PriorityQueue<>((a,b)->{
            if(a[1]==b[1]) return b[0]-a[0];
            return b[1]-a[1];
        });
        for(int key:map.keySet()){
            q.add(new int[]{key,map.get(key)});
        }
        int ans[]=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=q.poll()[0];
        }
        return ans;
    }
}
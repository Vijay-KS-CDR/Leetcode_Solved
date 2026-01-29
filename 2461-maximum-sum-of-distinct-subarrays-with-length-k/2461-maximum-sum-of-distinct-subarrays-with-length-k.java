class Solution {
    public long maximumSubarraySum(int[] arr, int k) {
        if(arr.length<k){
            return 0;
        }
        HashMap<Integer,Integer> set=new HashMap<>();
        long ans=0,max=0;
        for(int i=0;i<k;i++){
            ans+=arr[i];
            set.put(arr[i],set.getOrDefault(arr[i],0)+1);
        }
        if(set.size()==k){
        max=Math.max(ans,max);
        }
        if(arr.length==k){
            return max;
        }
        for(int i=k;i<arr.length;i++){
            ans+=arr[i];
            ans-=arr[i-k];
            set.put(arr[i],set.getOrDefault(arr[i],0)+1);
            set.put(arr[i-k],set.get(arr[i-k])-1);

            if(set.get(arr[i-k])==00)
            {
                set.remove(arr[i-k]);
            }
            if(set.size()==k){
            max=Math.max(ans,max);
            }
        }
        return max;
    }
}
class Solution {
    public String[] findRelativeRanks(int[] score) {
        String first = "Gold Medal";
        String sec = "Silver Medal";
        String thr = "Bronze Medal";
        int []arr=score.clone();
        Arrays.sort(arr);
        int j=1;
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i = arr.length-1; i>=0 ; i--){
            map.put(arr[i],j++);
        }
        String[] ans=new String[score.length];
        for(int i = 0; i < score.length ; i++)
        {
            int a=map.get(score[i]);
            if(a == 1){
                ans[i]=first;
                continue;
            } if(a == 2){
                ans[i]=sec;
                continue;
            }
             if(a == 3){
                ans[i]=thr;
                continue;
            }
            ans[i]=String.valueOf(a);
        }
        return ans;
    }
}
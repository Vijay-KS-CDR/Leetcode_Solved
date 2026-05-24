class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int freq[]=new int[101];
        for(int i:nums){
            freq[i]++;
        }
        ArrayList<Integer> lst=new ArrayList<>();
        for(int i=0;i<freq.length;i++){
            if(freq[i]==0){
                continue;
            }
            if(freq[i]>=k){
                for(int j=0;j<k;j++){
                    lst.add(i);
                }
            }else{
                while(freq[i]-->0){
                lst.add(i);
                }
            }
        }
        int[] ans=new int[lst.size()];
        for(int i=0;i<lst.size();i++){
            ans[i]=lst.get(i);
        }
        return ans;
    }
}
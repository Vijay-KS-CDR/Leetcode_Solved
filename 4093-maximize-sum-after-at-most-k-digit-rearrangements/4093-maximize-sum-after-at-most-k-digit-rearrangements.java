class Solution {
    public long maximizeSum(int[] nums, int k) {
        int gain[] = new int[nums.length];
        long sum  = 0;
        int j=0;
        for(int i:nums){
            sum+=i;
            int original = i;
            int freq[] = new int[10];
            while(i!=0){
                int a = i % 10;
                freq[a]++;
                i=i/10;
            }
            int temp = 0;
            for(int a=9;a>=0;a--){
                while(freq[a]>0){
                    temp = temp * 10 + a;
                    freq[a]--;
                }
            }
            gain[j] = temp - original; 
            j++;
        }
        Arrays.sort(gain);
        for(int i=gain.length-1;i>=gain.length-k;i--){
            sum+=gain[i];
        }
        return sum;
    }
}
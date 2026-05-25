class Solution {
    public int getLeastFrequentDigit(int n) {
        int freq[]=new int[10];
        while(n!=0){
            int s=n%10;
            freq[s]++;
            n=n/10;
        }
        int min=-1;
        int minc=(int)1e9;
        for(int i=0;i<freq.length;i++){
            if( freq[i]!=0 && freq[i]<minc){
                minc=freq[i];
                min=i;
            }
        }
        return min;
    }
}
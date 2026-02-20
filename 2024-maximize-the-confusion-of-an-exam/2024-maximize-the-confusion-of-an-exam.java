class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        char arr[]=answerKey.toCharArray();
        int l=0;
        int t=0;
        int f=0,ans1=0,ans2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='T'){
                t++;
            }
            while(t>k){
                if(arr[l]=='T'){
                    t--;
                }
                l++;
            }
            ans1=Math.max(ans1,i-l+1);
        }
        l=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='F'){
                f++;
            }
            while(f>k){
                if(arr[l]=='F'){
                    f--;
                }
                l++;
            }
            ans1=Math.max(ans1,i-l+1);
        }

        return ans1;
    }
}
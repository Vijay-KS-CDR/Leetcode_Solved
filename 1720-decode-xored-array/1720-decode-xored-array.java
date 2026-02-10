class Solution {
    public int[] decode(int[] encoded, int first) {
        int d[]=new int[encoded.length+1];
        d[0]=first;
        for(int i=0;i<encoded.length;i++){
            d[i+1]=d[i]^encoded[i];
        }
        return d;
    }
}
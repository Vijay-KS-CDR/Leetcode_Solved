class Solution {
    public int findKthPositive(int[] arr, int k) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        for(int i=0;i<=(int)1e9;i++){
            if(!set.contains(i)){
                k--;
                if(k==-1){
                    return i;
                }
            }
        }
        return -1;
    }
}
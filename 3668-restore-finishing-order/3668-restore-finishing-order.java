class Solution {
    public int[] recoverOrder(int[] order, int[] f) {
       int arr[]=new int[f.length];
       HashSet<Integer> set=new HashSet<>();
      for(int i=0;i<f.length;i++){
        set.add(f[i]);
      }
      int j=0;
      for(int i=0;i<order.length;i++){
        if(set.contains(order[i])){
            arr[j++]=order[i];
        }
      }
      return arr;
    }
}
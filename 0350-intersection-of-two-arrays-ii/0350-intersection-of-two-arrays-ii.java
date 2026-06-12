class Solution {
    void adder(ArrayList<Integer> lst,int n,int x){
        while(n-->0){
            lst.add(x);
        }
    }
    public int[] intersect(int[] nums1, int[] nums2) {
       HashMap<Integer,Integer>map1=new HashMap<>(); 
       HashMap<Integer,Integer>map2=new HashMap<>();
       for(int i:nums1){
        map1.put(i,map1.getOrDefault(i,0)+1);
       }
       for(int i:nums2){
        map2.put(i,map2.getOrDefault(i,0)+1);
       }
       ArrayList<Integer> lst=new ArrayList<>();
       for(int i:map1.keySet()){
            if(map2.containsKey(i)){
                adder(lst,Math.min(map1.get(i),map2.get(i)),i);
            }
       }
       int arr[]=new int[lst.size()];
       for(int i=0;i<arr.length;i++){
            arr[i]=lst.get(i);
       }
       return arr;
    }
}
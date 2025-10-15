class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        HashSet<Integer> lst=new HashSet<>();
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                lst.add(nums2[i]);
            }
        }
        int[] arr=new int[lst.size()];
        int i=0;
        for(int s:lst){
            arr[i++]=s;
        }
        return arr;
    }
}
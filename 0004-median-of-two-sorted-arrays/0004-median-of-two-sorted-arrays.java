class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a[]=new int[nums1.length+nums2.length];
        int j=0;
        for(int i=0;i<a.length;i++){
            if(i<nums1.length){
                a[i]=nums1[i];
            }else{
                a[i]=nums2[j];
                j++;
            }
        }
        Arrays.sort(a);
        if(a.length %2 == 1){
            return a[a.length/2];
        }
        return (a[a.length/2]+a[(a.length/2)-1])/2.0;
    }
}
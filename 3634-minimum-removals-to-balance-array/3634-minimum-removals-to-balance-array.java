class Solution {
    public int minRemoval(int[] nums, int k) {
    Arrays.sort(nums);
    int left=0;
    int right=0;
    int size=0;
    for(left=0;left<nums.length;left++){
        while(nums[left]>(long)nums[right]*k){
            right++;
        }
        size=Math.max(left-right+1,size);
    }
    return nums.length-size;
    }
}
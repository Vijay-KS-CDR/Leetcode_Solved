class Solution {
    public int[] transformArray(int[] nums) {
        int even=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                even++;
            }
        }
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(even !=0){
                even--;
            }
            else{
                arr[i]=1;
            }
        }
        return arr;
    }
}
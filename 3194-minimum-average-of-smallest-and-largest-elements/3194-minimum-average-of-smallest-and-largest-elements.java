class Solution {
    public double minimumAverage(int[] nums) {
        double ans = Double.MAX_VALUE;
        Arrays.sort(nums);
        int l=0,r=nums.length-1;
        while(l<r){
            double temp = ((double) nums[l]+ (double)nums[r])/2;
            if(temp<ans){
                ans = temp;
            }
            System.out.println(nums[l]+" "+nums[r]+" "+temp);
            l++;
            r--;
        }
        return ans;
    }
}
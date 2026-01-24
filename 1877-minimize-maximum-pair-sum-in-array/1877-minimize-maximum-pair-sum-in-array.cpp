class Solution {
public:
    int minPairSum(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int maxAns=0;
        int left=0,right=nums.size()-1;
        while(left<right){
            maxAns=max(maxAns,nums[left++]+nums[right--]);
        }
        return maxAns;

    }
};
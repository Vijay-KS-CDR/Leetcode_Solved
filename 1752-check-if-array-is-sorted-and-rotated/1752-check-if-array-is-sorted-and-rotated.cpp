class Solution {
public:
    bool check(vector<int>& nums) {
        int a=0;
        int n=nums.size();
        for(int i=0;i<nums.size();i++){
            if(nums[i]>nums[(i+1)%n]){
                a++;
            }
        }
        cout<<a<<endl;
        return a==1 || a==0;
    }
};
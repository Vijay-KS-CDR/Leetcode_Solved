class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> lst = new ArrayList<Integer>();
        for(int i=nums.length
        -1;i>=0;i--){
            int n=nums[i];
            while(n!=0){
                lst.add(n%10);
                n=n/10;
            }
        }
        Collections.reverse(lst);
        int ans[]=new int[lst.size()];
        for(int i=0;i<lst.size();i++){
            ans[i]=lst.get(i);
        }
        return ans;
    }
}
class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder b=new StringBuilder();
        for(int i=0;i<nums.length;i++){
            char s=nums[i].charAt(i);
            b.append(s=='0'?"1":"0");
        }
        return b.toString();
    }
}
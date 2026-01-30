class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int left=0,right=0;
        char arr[]=s.toCharArray();
        int max=0;
        while(left<s.length() && right<s.length()){
            if(set.add(arr[right])){
            max=Math.max(set.size(),max);
            right++;
            }
            else{
                set.remove(arr[left++]);
            }
        }
        return max;
    }
}
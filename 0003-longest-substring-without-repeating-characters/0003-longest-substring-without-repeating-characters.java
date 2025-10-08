class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int right=0;
        Set<Character> set=new HashSet<>();
        char a[]=s.toCharArray();
        int result=0;
        for(right=0;right<a.length;right++){
            while(set.contains(a[right])){
                set.remove(a[left]);
                left++;
            }
            set.add(a[right]);
            result=Math.max(result,right-left+1);
        }
       return result;
    }
}
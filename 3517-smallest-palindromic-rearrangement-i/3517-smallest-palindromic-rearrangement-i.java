class Solution {
    public String smallestPalindrome(String s) {
        StringBuilder ans=new StringBuilder();
        int len=s.length();
        int mid=len/2;
        char a[]=new char[mid];
        for(int i = 0;i<mid;i++){
            a[i]=s.charAt(i);
        }
        Arrays.sort(a);
        ans.append(a);
        if((len&1)==1){
            ans.append(s.charAt(mid));
        }
        ans.append(new StringBuilder().append(a).reverse());
        return ans.toString();
    }
}
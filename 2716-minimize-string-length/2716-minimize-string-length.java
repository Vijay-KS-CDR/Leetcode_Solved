class Solution {
    public int minimizedStringLength(String s) {
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        int c=0;
        for(int i:arr){
            if(i>=1){
                c++;
            }
        }
        return c;
    }
}
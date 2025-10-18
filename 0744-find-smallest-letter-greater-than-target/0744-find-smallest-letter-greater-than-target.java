class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char max=target;
        for(char s:letters){
            if(max<s){
                max=s;
                return max;
            }
        }
        return letters[0];
    }
}
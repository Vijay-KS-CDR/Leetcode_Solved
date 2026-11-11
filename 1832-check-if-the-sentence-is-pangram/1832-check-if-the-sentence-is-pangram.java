class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] freq = new boolean[26];
        for(char a : sentence.toCharArray()){
            freq[a-'a']=true;
        }
        for(boolean s : freq){
            if(!s){
                return false;
            }
        }
        return true;
    }
}
class Solution {
    public int countCharacters(String[] words, String chars) {
    int arr[]=new int[26];
        for(char s:chars.toCharArray()){
            arr[s-'a']++;
        }
        int sum=0;
        for(String s:words){
            if(canForm(s,arr)){
                sum+=s.length();
            }
        }
        return sum;
    }
    boolean canForm(String s,int[] arr){
        for(char ch:s.toCharArray()){
            if(arr[ch-'a']==0){
                return false;
            }
        }
        return true;
    }
    }
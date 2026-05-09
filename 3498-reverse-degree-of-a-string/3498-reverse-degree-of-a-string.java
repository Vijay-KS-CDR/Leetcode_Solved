class Solution {
    public int reverseDegree(String str) {
        int sum=0;
        int start=26;
        HashMap<Character,Integer> map=new HashMap<>();
        for(char s='a' ; s<='z' ; s++){
            map.put(s,start--);
        }
        for(int i=0;i<str.length();i++){
            sum+=(1+i)*(map.get(str.charAt(i)));
        }
        return sum;
    }
}
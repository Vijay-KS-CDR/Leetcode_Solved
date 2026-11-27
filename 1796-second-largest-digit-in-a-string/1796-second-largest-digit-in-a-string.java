class Solution {
    public int secondHighest(String s) {
        HashSet<Integer> set = new HashSet<>();
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                set.add(ch-'0');
            }
        }
        int sec = Integer.MIN_VALUE;
        int fir = Integer.MIN_VALUE;
        for(int a: set){
            if(a>fir){
                sec=fir;
                fir = a;
            }
            else if(a>sec){
                sec = a;
            }
        }
        return (sec == Integer.MIN_VALUE)? -1: sec;
    }
}
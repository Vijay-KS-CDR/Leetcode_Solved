class Solution {
    public int passwordStrength(String password) {
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<password.length();i++){
            char s=password.charAt(i);
            set.add(s);
        }
        int score=0;
        for(char i:set){
            if(Character.isLetter(i)){
                if(Character.isUpperCase(i)){
                    score+=2;
                }else{
                    score+=1;
                }
            }
            if(Character.isDigit(i)){
                score+=3;
            }
            if("!@#$".indexOf(i)!=-1){
                score+=5;
            }
        }
        return score;
    }
}
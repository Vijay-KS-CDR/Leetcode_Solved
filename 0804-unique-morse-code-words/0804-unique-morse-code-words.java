class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morseCode = {
    ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", 
    ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", 
    "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
    };
    HashSet<String> set=new HashSet<>();
    for(int i=0;i<words.length;i++){
        String s="";
        for(int j=0;j<words[i].length();j++){
            s+=morseCode[words[i].charAt(j)-'a'];
        }
        set.add(s);
    }
    return set.size();
    }
}
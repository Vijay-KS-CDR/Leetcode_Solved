class Solution {
    public boolean checkStrings(String s1, String s2) {
        ArrayList<Character> odd1= new ArrayList<>();
        ArrayList<Character> odd2=new ArrayList<>();
        ArrayList<Character> evn1=new ArrayList<>();
        ArrayList<Character> evn2=new ArrayList<>();
        for(int i=0;i<s1.length();i++){
            if(i%2==0){
                odd1.add(s1.charAt(i));
                odd2.add(s2.charAt(i));
                continue;
            }
            evn1.add(s1.charAt(i));
            evn2.add(s2.charAt(i));
        }
        Collections.sort(odd1);
        Collections.sort(odd2);
        Collections.sort(evn1);
        Collections.sort(evn2);
        return odd1.equals(odd2) && evn1.equals(evn2);
    }
}
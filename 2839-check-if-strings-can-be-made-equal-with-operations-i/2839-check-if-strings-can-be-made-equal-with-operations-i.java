class Solution{
    public boolean canBeEqual(String s1, String s2) {
        ArrayList<Character> odd1,odd2,evn1,evn2;
        odd1=new ArrayList<>();
        odd2=new ArrayList<>();
        evn1=new ArrayList<>();
        evn2=new ArrayList<>();
        for(int i=0;i<4;i++){
            char ch1=s1.charAt(i);
            char ch2=s2.charAt(i);
            if(i%2==0){
                odd1.add(ch1);
                odd2.add(ch2);
                continue;
            }
            evn1.add(ch1);
            evn2.add(ch2);
        }
        Collections.sort(evn1);
        Collections.sort(evn2);
        Collections.sort(odd1);
        Collections.sort(odd2);
        return evn1.equals(evn2) && odd1.equals(odd2);
    }
}
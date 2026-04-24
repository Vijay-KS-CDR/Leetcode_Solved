class Solution {
    public boolean buddyStrings(String s, String g) {
        int []freq=new int[26];
        if(s.length()!=g.length()){
            return false;
        }
        if(s.equals(g)){
            for(int i=0;i<s.length();i++){
                freq[s.charAt(i)-'a']++;
                if(freq[s.charAt(i)-'a']==2){
                    return true;
                }
            }
            return false;
        }
        int idx1=-1,idx2=-1;
        int i=0;
        for( i=0;i<s.length();i++){
            if(s.charAt(i)!=g.charAt(i)){
                if(idx1==-1){
                    idx1=i;
                }else if(idx2==-1){
                    idx2=i;
                }
            }
        }
        if(idx1>=0 && idx2>=0){
            char A[]=s.toCharArray();
            char temp=A[idx1];
            A[idx1]=A[idx2];
            A[idx2]=temp;
            if(String.valueOf(A).equals(g)){
                return true;
            }
        }
        return false;
       
    }
}
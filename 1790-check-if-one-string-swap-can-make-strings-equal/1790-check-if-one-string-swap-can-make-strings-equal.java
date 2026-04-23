class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
        if(s1.equals(s2)){
            return true;
        }
        int idx1=-1,idx2=-1;
        int i=0;
        for( i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                if(idx1==-1){
                    idx1=i;
                }else if(idx2==-1){
                    idx2=i;
                }
            }
        }
        if(idx1>=0 && idx2>=0){
            char A[]=s2.toCharArray();
            char temp=A[idx1];
            A[idx1]=A[idx2];
            A[idx2]=temp;
            if(String.valueOf(A).equals(s1)){
                return true;
            }
        }
        return false;
    }
}
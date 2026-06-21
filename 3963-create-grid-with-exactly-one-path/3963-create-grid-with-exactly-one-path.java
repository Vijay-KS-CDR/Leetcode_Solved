class Solution {
    public String[] createGrid(int m, int n) {
        String s[]=new String[m];
        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append(".");
            if(i==n-1){
                sb1.append(".");
            }else{
            sb1.append("#");
            }
        }
        String dot=sb.toString();
        String hash=sb1.toString();
        for(int i=0;i<m;i++){
            if(i==0){
                s[i]=dot;
            }
            else{
                s[i]=hash;
            }
        }
        return s;
    }
}
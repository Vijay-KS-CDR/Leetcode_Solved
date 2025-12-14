class Solution {
    private boolean isSelfDivide(int i,int n){
        while(i!=0){
            int s=i%10;
            if(s==0 || n%s!=0){
                return false;
            }
            i=i/10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> lst=new ArrayList<>();
        for(int i=left;i<=right;i++){
                if(isSelfDivide(i,i)){
                    lst.add(i);
                }
            }
        return lst;
    }
}
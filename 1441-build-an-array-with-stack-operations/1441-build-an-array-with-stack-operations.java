class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> lst=new ArrayList<>();
        String a="Push",b="Pop";
        int j=0;
        for(int i=1;i<=n && j<target.length;i++){
            if(i==target[j]){
                lst.add(a);
                j++;
            }else{
                lst.add(a);
                lst.add(b);
            }
        }
        return lst;
    }
}
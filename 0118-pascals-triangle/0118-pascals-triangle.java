class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>lst=new ArrayList<>();
        lst.add(new ArrayList<>());
        lst.get(0).add(1);
        for(int i=1;i<numRows;i++){
            List<Integer> prev=lst.get(i-1);
            List<Integer> temp=new ArrayList<>();
            temp.add(1);
            for(int j=0;j<i-1;j++){
                temp.add(prev.get(j)+prev.get(j+1));
            }
            temp.add(1);
            lst.add(temp);
        }
        return lst;
    }
}
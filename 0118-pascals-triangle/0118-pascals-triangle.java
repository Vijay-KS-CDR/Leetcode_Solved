class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>lst=new ArrayList<>();
        lst.add(new ArrayList<>());
        lst.get(0).add(1);
        for(int i=1;i<numRows;i++){
            List<Integer> prev=lst.get(i-1);
            List<Integer> temp=new ArrayList<>();
            temp.add(1);
            for(int j=1;j<i;j++){
                temp.add(prev.get(j-1)+prev.get(j));
            }
            temp.add(1);
            lst.add(temp);
        }
        return lst;
    }
}
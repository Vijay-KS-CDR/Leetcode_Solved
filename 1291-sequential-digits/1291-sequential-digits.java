class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> lst=new ArrayList<>();
        for(int i = 1; i <= 8; i++){
            int num=i;
            for(int n = i+1 ; n<10; n++){
                num=num*10+n;
                if(num<=high && num>=low){
                    lst.add(num);
                }
            }
        }
        Collections.sort(lst);
        return lst;
    }
}
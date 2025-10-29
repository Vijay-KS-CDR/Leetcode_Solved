class Solution {
    public int numberOfBeams(String[] bank) {
        List<Integer> lst =new ArrayList<>();
        for(int i=0;i<bank.length;i++){
            if(!bank[i].contains("1")){
                continue;
            }
            else{
                int c=0;
                for(int ch:bank[i].toCharArray()){
                    if(ch=='1')c++;
                }
                lst.add(c);
            }
        }
        int arr[]=new int[lst.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=lst.get(i);
        }
        if(arr.length<=1)
        return 0;

        int sum=0;
        for(int i=0;i<arr.length-1;i++){
            sum+=(arr[i]*arr[i+1]);
        }
        return sum;
    }
}
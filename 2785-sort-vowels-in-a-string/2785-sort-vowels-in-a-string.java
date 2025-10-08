class Solution {
    public String sortVowels(String s) {
        List<Character> lst=new ArrayList<>();
        char arr[]=s.toCharArray();
        String vow="AEIOUaeiou";
        for(char x:arr){
            if(vow.indexOf(x)>=0){
                lst.add(x);
            }
        }
        Collections.sort(lst);
        int getList=0;
        for(int i=0;i<arr.length;i++){
            if(vow.indexOf(arr[i])>=0){
                    arr[i]=lst.get(getList++);
            }
        }
        return String.valueOf(arr);
}
}
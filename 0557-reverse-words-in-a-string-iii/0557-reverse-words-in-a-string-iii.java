class Solution {
    public String reverseWords(String s) {
        String[] arr=s.trim().split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            arr[i]=new StringBuilder(arr[i]).reverse().toString();
        }
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
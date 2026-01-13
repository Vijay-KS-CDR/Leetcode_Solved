class Solution {
    public String reverseVowels(String s) {
        char arr[]=s.toCharArray();
        int left=0,right=arr.length-1;
        String v="AEIOUaeiou";
        while(left<=right){
            if(v.indexOf(arr[left])!=-1 && v.indexOf(arr[right])!=-1){
                char temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
            else if(v.indexOf(arr[left])!=-1){
                right--;
            }
            else if(v.indexOf(arr[right])!=-1){
                left++;
            }
            else{
                left++;
                right--;
            }
        }
        return String.valueOf(arr);
    }
}
class Solution {
    void swap(char arr[],int i ,int j ){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public String reverseOnlyLetters(String s) {
        char arr[]=s.toCharArray();
        int l=0;
        int r=arr.length-1;
        while(l<r){
            if(Character.isLetter(arr[l]) && Character.isLetter(arr[r])){
                swap(arr,l,r);
                l++;
                r--;
            }
            else if(Character.isLetter(arr[l])){
                r--;
            }
            else if(Character.isLetter(arr[r])){
                l++;
            }
            else{
                l++;
                r--;
            }
        }
        return new String(arr);
    }
}
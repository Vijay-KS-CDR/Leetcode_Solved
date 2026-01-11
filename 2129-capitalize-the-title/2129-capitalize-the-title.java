class Solution {
    public String capitalizeTitle(String title) {
        title=title.toLowerCase();
        StringBuilder sb=new StringBuilder();
        String arr[]=title.split("\\s+");
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()>=3){
            sb.append(arr[i].substring(0,1).toUpperCase()+arr[i].substring(1));
            }
            else{
                sb.append(arr[i]);
            }
             if(i!=arr.length-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
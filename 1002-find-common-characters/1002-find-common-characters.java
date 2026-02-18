class Solution {
    public List<String> commonChars(String[] words) {
        ArrayList<String> lst=new ArrayList<>();
        int n=words.length;
        char[] arr=words[0].toCharArray();
        int first[]=new int[26];
        for(char a:arr){
            first[a-'a']++;
        }
        for(int i=0;i<n;i++){
            int temp[]=new int[26];
            for(char a:words[i].toCharArray()){
                temp[a-'a']++;
            }
            for(int j=0;j<temp.length;j++){
                first[j]=Math.min(temp[j],first[j]);
            }
        }

        for(int i=0;i<26;i++){
            if(first[i]==0){
                continue;
            }
            while(first[i]>0){
                lst.add(String.valueOf((char)(i+'a')));
                first[i]--;
            }
        }


        return lst;
     }
}
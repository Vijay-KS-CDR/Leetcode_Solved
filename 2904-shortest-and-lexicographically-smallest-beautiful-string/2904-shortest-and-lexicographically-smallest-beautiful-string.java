class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String ans =  "";
        int len=1000;
        int l=0;
        int ones=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                ones++;
            }
            while(ones==k){
                while(l<i && s.charAt(l)=='0'){
                    l++;
                }

                String temp = s.substring(l,i+1);
                int low = i-l+1;

                if(low<len){
                    ans = temp;
                    len = low;
                }
                else if(low == len){
                    ans = (temp.compareTo(ans)<0) ? temp : ans;
                }
                if(s.charAt(l)=='1'){
                    ones--;
                }
                l++;
            }
        }
          return ans;
    }
}
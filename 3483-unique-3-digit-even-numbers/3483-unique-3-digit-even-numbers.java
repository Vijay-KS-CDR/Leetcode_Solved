class Solution {
    public int totalNumbers(int[] digits) {
        int l=0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<digits.length;i++){
            if(digits[i]==0) continue;
            for(int j=0;j<digits.length;j++){
                if(i==j) continue;
                for(int k=0;k<digits.length;k++){
                    if(k==i || k==j) continue;
                    int number =  digits[i]*100+digits[j]*10+digits[k];
                    if(number%2==0) set.add(number);
                }
            }
        }
        return set.size();
    }
}
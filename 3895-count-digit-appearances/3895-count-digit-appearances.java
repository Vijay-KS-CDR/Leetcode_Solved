class Solution {
    int isThere( int n , int digit ){
        int s = 0;
        while( n != 0){
            if( n % 10 == digit ){
                s++;
            }
            n = n / 10;
        }
        return s;
    }
    public int countDigitOccurrences(int[] nums, int digit) {
        int count = 0;
        for( int i = 0 ; i < nums.length ; i++ ){
            count += isThere( nums[i] , digit ); 
        }
        return count;
    }
}
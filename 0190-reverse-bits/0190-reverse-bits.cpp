class Solution {
public:
    int reverseBits(int n) {
        unsigned int s=0;
        for(int i=0;i<32;i++){
            unsigned int bit=(n&1);
            s|=(bit);
            s<<=1;
            n>>=1;
        }
        return s>>1;
    }
};
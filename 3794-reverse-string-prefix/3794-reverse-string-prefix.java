class Solution {
    public String reversePrefix(String s, int k) {
        String part = s.substring(0,k);
        return new StringBuilder(new StringBuilder(part).reverse()).append(s.substring(k)).toString();
    }
}
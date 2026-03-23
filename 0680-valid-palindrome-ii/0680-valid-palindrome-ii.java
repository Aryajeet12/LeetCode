class Solution {
    public boolean validPalindrome(String s) {
        int a=0;
        int b=s.length()-1;
        while (a < b) {
            if (s.charAt(a) != s.charAt(b)) {
                return isPalindrome(s, a + 1, b) || 
                       isPalindrome(s, a, b - 1);
            }
            a++;
            b--;
        }

        return true;
    }

    private boolean isPalindrome(String s, int a, int b) {
        while (a < b) {
            if (s.charAt(a) != s.charAt(b)) {
                return false;
            }
            a++;
            b--;
        }
        return true;
    }
}
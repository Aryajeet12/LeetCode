class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] arr = s.toCharArray();
        char[] a = t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(a);
        return Arrays.equals(arr, a);
    }
}
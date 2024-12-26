class Solution {
    public String longestPrefix(String s) {
        int n = s.length();
        int[] lps = new int[n];
        int length = 0; // Length of the previous longest prefix suffix

        // Compute LPS array
        for (int i = 1; i < n; i++) {
            while (length > 0 && s.charAt(i) != s.charAt(length)) {
                length = lps[length - 1];
            }
            if (s.charAt(i) == s.charAt(length)) {
                length++;
            }
            lps[i] = length;
        }

        // The length of the longest happy prefix
        int longestPrefixLength = lps[n - 1];
        return s.substring(0, longestPrefixLength);
    }
}

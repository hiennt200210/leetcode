class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        int longestPalindromeLength = 0;
        int longestPalindromeStartIndex = 0;
        
        for (int i = 0; i < s.length(); i++) {
            int j = i, k = i;
            while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
                j--;
                k++;
            }
            if (longestPalindromeLength < (k - j - 1)) {
                longestPalindromeLength = k - j - 1;
                longestPalindromeStartIndex = j + 1;
            }

            j = i;
            k = i + 1;
            while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
                j--;
                k++;
            }
            if (longestPalindromeLength < (k - j - 1)) {
                longestPalindromeLength = k - j - 1;
                longestPalindromeStartIndex = j + 1;
            }
        }

        return s.substring(longestPalindromeStartIndex, longestPalindromeStartIndex + longestPalindromeLength);
    }
}
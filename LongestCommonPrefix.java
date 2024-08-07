public class LongestCommonPrefix {
    
    public void test() {

        String[] strs1 = {"flower","flow","flight"};
        if (longestCommonPrefix(strs1).equals("fl")) {
            System.out.println("Case 1: Pass");
        } else {
            System.out.println("Case 1: Fail");
        }

        String[] strs2 = {"dog","racecar","car"};
        if (longestCommonPrefix(strs2).isEmpty()) {
            System.out.println("Case 2: Pass");
        } else {
            System.out.println("Case 2: Fail");
        }

        String[] strs3 = {"dog"};
        if (longestCommonPrefix(strs3).equals("dog")) {
            System.out.println("Case 3: Pass");
        } else {
            System.out.println("Case 3: Fail");
        }

        String[] strs4 = {"ab", "a"};
        if (longestCommonPrefix(strs4).equals("a")) {
            System.out.println("Case 4: Pass");
        } else {
            System.out.println("Case 4: Fail");
        }
    }

    /**
     * Longest Common Prefix
     * https://leetcode.com/problems/longest-common-prefix/
     */
    public String longestCommonPrefix(String[] strs) {

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}
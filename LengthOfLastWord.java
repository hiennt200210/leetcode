/**
 * 58. Length of Last Word
 * https://leetcode.com/problems/length-of-last-word/
 */
public class LengthOfLastWord {

    public void test() {
        
        if (lengthOfLastWord("Hello World") == 5) {
            System.out.println("Case 1: Pass");
        } else {
            System.out.println("Case 1: Fail");
        }

        if (lengthOfLastWord("   fly me   to   the moon  ") == 4) {
            System.out.println("Case 2: Pass");
        } else {
            System.out.println("Case 2: Fail");
        }

        if (lengthOfLastWord("luffy is still joyboy") == 6) {
            System.out.println("Case 3: Pass");
        } else {
            System.out.println("Case 3: Fail");
        }
    }
    
    public int lengthOfLastWord(String s) {

        int result = 0;
        String trimString = s.trim();

        for (int i = trimString.length() - 1; i >= 0; i--) {
            if (trimString.charAt(i) == ' ') {
                break;
            } else {
                result++;
            }
        }

        return result;
    }
}

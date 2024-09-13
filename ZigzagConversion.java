
/**
 * 6. Zigzag Conversation
 * https://leetcode.com/problems/zigzag-conversion/description/
 */
public class ZigzagConversation {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        int currentRow = 0;
        int direction = 1;
        String[] zigzagRows = new String[numRows];

        for (int i = 0; i < numRows; i++) {
            zigzagRows[i] = "";
        }

        for (char c : s.toCharArray()) {

            zigzagRows[currentRow] += c;
            
            if (currentRow == 0) {
                direction = 1;
            }

            if (currentRow == numRows - 1) {
                direction = -1;
            }

            currentRow += direction;
        }

        StringBuilder result = new StringBuilder();
        for (String row : zigzagRows) {
            result.append(row);
        }

        return result.toString();
    }
}

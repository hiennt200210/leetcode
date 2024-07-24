/**
 * 66. Plus One
 * https://leetcode.com/problems/plus-one/
 */
public class PlusOne {
    
    public int[] plusOne(int[] digits) {
        
        int s = 0, m = 1;

        for (int i = digits.length - 1; i >= 0; i--) {
            s = digits[i] + m;
            m = (s < 10) ? 0 : 1;
            digits[i] = s % 10;
        }

        if (m == 1) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            for (int i = 1; i < newDigits.length; i++) {
                newDigits[i] = 0;
            }
            return newDigits;
        }

        return digits;
    }
}

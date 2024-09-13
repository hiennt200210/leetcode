/**
 * 7. Reverse Integer
 * https://leetcode.com/problems/reverse-integer/description/
 */
public class ReverseInteger {
    public int reverse(int x) {
        int inputNumber = x;
        int reversal = 0;

        while (inputNumber != 0) {
            if (Math.abs(reversal) > Integer.MAX_VALUE / 10) {
                return 0;
            }
            reversal = reversal * 10 + inputNumber % 10;
            inputNumber /= 10;
        }

        return reversal;
    }
}

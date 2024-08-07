public class RomanToInteger {

    public static void main(String[] args) {
        new RomanToInteger().start();
    }

    public void start() {
        if (romanToInt("III") == 3) {
            System.out.println("Case 1: Pass");
        } else {
            System.out.println("Case 1: False");
        }
        if (romanToInt("LVIII") == 58) {
            System.out.println("Case 2: Pass");
        } else {
            System.out.println("Case 2: False");
        }
        if (romanToInt("MCMXCIV") == 1994) {
            System.out.println("Case 3: Pass");
        } else {
            System.out.println("Case 3: False");
        }
    }

    public int romanDigitToInt(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public int romanToInt(String s) {
        int integerNumber = romanDigitToInt(s.charAt(0));
        int previousDigitValue = integerNumber;

        for (int i = 1; i < s.length(); i++) {
            int currentDigitValue = romanDigitToInt(s.charAt(i));
            if (currentDigitValue > previousDigitValue) {
                integerNumber += currentDigitValue - 2 * previousDigitValue;
            } else {
                integerNumber += currentDigitValue;
            }
            previousDigitValue = currentDigitValue;
        }

        return integerNumber;
    }
}

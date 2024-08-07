class PalindromeNumber {
    public static void main(String[] args) {
        new PalindromeNumber().start();
    }

    public void start() {
        System.out.println(isPalindrome(-121));
    }

    public boolean isPalindrome(int x) {
        System.out.println("x: " + x);

        int number = x;
        int reversal = 0;
        int digit;
        while (x != 0) {
            digit = x % 10;
            reversal = reversal * 10 + digit;
            x /= 10;
        }
        
        System.out.println("reversal: " + reversal);

        if (number == reversal)
            return true;
        return false;
    }
}
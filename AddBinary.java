/**
 * 67. Add Binary
 * https://leetcode.com/problems/add-binary/
 */
public class AddBinary {

    public void test() {
        
        System.out.println("Case 1: a = 11; b = 1");
        if (addBinary("11", "1").equals("100")) {
            System.out.println("Case 1: Pass");
        } else {
            System.out.println("Case 1: Fail");
        }

        System.out.println("Case 2: a = 1010; b = 1011");
        if (addBinary("1010", "1011").equals("10101")) {
            System.out.println("Case 2: Pass");
        } else {
            System.out.println("Case 2: Fail");
        }

        System.out.println("Case 3: a = 1111; b = 1111");
        if (addBinary("1111", "1111").equals("11110")) {
            System.out.println("Case 3: Pass");
        } else {
            System.out.println("Case 3: Fail");
        }
    }

    public String addBinary(String a, String b) {

        int lengthA = a.length();
        int lengthB = b.length();
        
        if (lengthA < lengthB) {
            return addBinary(b, a);
        }

        StringBuilder result = new StringBuilder();
        int iA = lengthA - 1, iB = lengthB - 1, memory = 0, sum = 0;

        while (iA >= 0) {
            if (iB >= 0) {
                sum = (a.charAt(iA) - '0') + (b.charAt(iB) - '0') + memory;
                iB--;
            } else {
                sum = (a.charAt(iA) - '0') + memory;
            }
            result.append(sum % 2);
            memory = sum / 2;
            iA--;
        }

        if (memory != 0) {
            result.append('1');
        }

        return result.reverse().toString();
    }
}
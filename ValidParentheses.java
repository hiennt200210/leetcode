import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    private static final Map<Character, Character> bracketsMap = new HashMap<>();

    static {
        bracketsMap.put(')', '(');
        bracketsMap.put(']', '[');
        bracketsMap.put('}', '{');
    }

    public void test() {

        if (isValid("()") == true) {
            System.out.println("Case 1: Pass");
        } else {
            System.out.println("Case 1: Fail");
        }

        if (isValid("()[]{}") == true) {
            System.out.println("Case 2: Pass");
        } else {
            System.out.println("Case 2: Fail");
        }

        if (isValid("(]") == false) {
            System.out.println("Case 3: Pass");
        } else {
            System.out.println("Case 3: Fail");
        }

        if (isValid("[") == false) {
            System.out.println("Case 4: Pass");
        } else {
            System.out.println("Case 4: Fail");
        }

        if (isValid("]") == false) {
            System.out.println("Case 5: Pass");
        } else {
            System.out.println("Case 5: Fail");
        }
    }

    /**
     * Valid Parenthese
     * https://leetcode.com/problems/valid-parentheses/
     */
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (bracketsMap.containsValue(c)) {
                stack.push(c);
                continue;
            }

            if (bracketsMap.containsKey(c)) {
                if (stack.isEmpty() || stack.pop() != bracketsMap.get(c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}

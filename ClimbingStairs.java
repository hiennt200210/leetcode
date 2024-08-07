import java.util.HashMap;
import java.util.Map;

/**
 * 70. Climbing Stairs (https://leetcode.com/problems/climbing-stairs/)
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways
 * can you climb to the top?
 */
public class ClimbingStairs {

    private static Map<Integer, Integer> stairs;

    static {
        stairs = new HashMap<>();
    }
    
    public void test() {

        if (climbStairs(2) == 2) {
            System.out.println("Case 1: Pass!");
        } else {
            System.out.println("Case 1: Fail!");
        }

        if (climbStairs(3) == 3) {
            System.out.println("Case 2: Pass!");
        } else {
            System.out.println("Case 2: Fail!");
        }
    }

    public int climbStairs(int n) {

        if (stairs.containsKey(n)) {
            return stairs.get(n);
        }
        
        if (n == 1 || n == 2) {
            stairs.put(n, n);
            return n;
        }

        int result = climbStairs(n - 1) + climbStairs(n - 2);
        stairs.put(n, result);
        return result;
    }
}

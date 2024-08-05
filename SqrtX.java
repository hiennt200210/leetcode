/**
 * 69. Sqrt(x)
 * https://leetcode.com/problems/sqrtx/
 */
public class SqrtX {

    public void test() {

        if (mySqrt(4) == 2) {
            System.out.println("Case 1: Pass!");
        } else {
            System.out.println("Case 1: Fail!");
        }

        if (mySqrt(8) == 2) {
            System.out.println("Case 2: Pass!");
        } else {
            System.out.println("Case 2: Fail!");
        }

        if (mySqrt(2147395600) == 46340) {
            System.out.println("Case 3: Pass!");
        } else {
            System.out.println("Case 3: Fail!");
        }

        if (mySqrt(2) == 1) {
            System.out.println("Case 4: Pass!");
        } else {
            System.out.println("Case 4: Fail!");
        }

        if (mySqrt(6) == 2) {
            System.out.println("Case 5: Pass!");
        } else {
            System.out.println("Case 5: Fail!");
        }
    }

    /**
     * Solution 2
     */
    public int mySqrt(int x) {

        if (x <= 1) {
            return x;
        }
        
        long start = 1;
        long end = x / 2;
        long mid = (start + end) / 2;
        long square;

        while (start <= end) {
            square = mid * mid;
            if (square > x) {
                end = mid - 1;
            } else if (square < x) {
                start = mid + 1;
            } else {
                return (int)mid;
            }
            mid = (start + end) / 2;
        }

        return (int)mid;
    }

    /*
     * Solution 1
     */
    // public int mySqrt(int x) {
        
    //     long result = 0;

    //     while ((result * result) <= x) {
    //         result++;
    //     }

    //     return (int)(result - 1);
    // }
}

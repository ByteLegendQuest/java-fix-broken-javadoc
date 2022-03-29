package com.bytelegend;
/**
 * There are some issues in the comments and Javadocs in this class, which fails `mvn verify`.
 * Please fix it and make sure `mvn verify` pass.
 * Note that you should only fix the errors, don't modify the comments themselves.
 *
 * Location: C:\\users\\Documents
 * Fix the maximum number in three numbers, e.g. max(1,2,3) -\> 3
 */
public class Challenge {
    /**
     * Find the maximum integer in three numbers.
     *
     * @param a the first number
     * @param b the second number
     * @param c the third number
     * @return maximum of three numbers
     */
    public static int max(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
}

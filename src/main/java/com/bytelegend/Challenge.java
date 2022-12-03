package com.bytelegend;

public class Challenge {
     /**
     * Find the maximum integer in three numbers.
     *
     * @param a the first number
     * @param b the second number
     * @param c the third number
     */
    public static int max(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
}

package com.bytelegend;

/**
 * 本类中的注释和Javadoc存在一些问题，会使得`mvn verify`失败。请修复之，确保`mvn verify`通过。
 * 注意：请只修复错误，不要修改注释内容。
 *
 * There are some issues in the comments and Javadocs in this class, which cause `mvn verify` to fail.
 * Please fix them and ensure that `mvn verify` passes.
 * Note: Only fix the errors, do not modify the comment content itself.
 */
public class Challenge {
    /**
     * Find the maximum integer among three numbers.
     *
     * @param a the first number
     * @param b the second number
     * @param c the third number
     * @return the maximum number among a, b, and c
     */
    public static int max(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
}

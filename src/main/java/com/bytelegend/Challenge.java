package com.bytelegend;
/**
 * 本类中的注释和Javadoc存在一些问题，会使得`mvn verify`失败。请修复之，确保`mvn verify`通过。<br>
 * 注意：请只修复错误，不要修改注释内容。
 */
 /**
 * There are some issues in the comments and Javadocs in this class, which fails `mvn verify`.<br>
 * Please fix it and make sure `mvn verify` pass.<br>
 * Note that you should only fix the errors, don't modify the comments themselves.
 */
 /**
 * Location: C:\users\Documents<br>
 * Fix the maximum number in three numbers, e.g. max(1,2,3) -> 3
 */
public class Challenge {
    /**
     * Find the maximum integer in three numbers.
     * @param a the first number<br>
     * @param b the second number<br>
     * @param c the third number<br>
     */
    public static int max(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
}

package com.bytelegend;
/**
 * <p>本类中的注释和Javadoc存在一些问题，会使得`mvn verify`失败。请修复之，确保`mvn verify`通过。</p>
 * <p>注意：请只修复错误，不要修改注释内容。</p>
 *
 * <p>There are some issues in the comments and Javadocs in this class, which fails `mvn verify`.</p>
 * <p>Please fix it and make sure `mvn verify` pass.</p>
 * <p>Note that you should only fix the errors, don't modify the comments themselves. </p>
 *
 * <p>Location: C:\users\Documents</p>
 * <p>Fix the maximum number in three numbers, e.g. max(1,2,3) -> 3</p>
 */
public class Challenge {
    /**
     * Find the maximum integer in three numbers.
     *
     * @param a the first number
     * @param b the second number
     * @param c the third number
     * @return the desc
     */
    public static int max(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
}

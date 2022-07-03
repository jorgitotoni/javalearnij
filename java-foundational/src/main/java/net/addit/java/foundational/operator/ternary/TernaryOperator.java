package net.addit.java.foundational.operator.ternary;

/**
 * 三元运算符
 *
 * @author tony 241963698@qq.com
 * @version 2022/6/27 下午12:51
 * @since JDK8
 */
public class TernaryOperator {
    public static void main(String[] args) {
        int left=10;
        int right=20;

        int max=left>right?left:right;
        int min=left<right?left:right;
        System.out.println("两个整数的最大值是"+max+"最小值是"+min);
    }
}

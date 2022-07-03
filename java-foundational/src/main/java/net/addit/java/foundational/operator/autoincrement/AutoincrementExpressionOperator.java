package net.addit.java.foundational.operator.autoincrement;

/**
 * 自增运算符复合使用
 *
 * @author tony 241963698@qq.com
 * @version 2022/6/26 下午3:33
 * @since JDK8
 */
public class AutoincrementExpressionOperator {
    public static void main(String[] args) {
        int number=10;
        int right=number++;
        System.out.println("right="+right);
        System.out.println("number="+number);

        int left=++number;
        System.out.println("left="+left);
        System.out.println("number="+number);

    }
}

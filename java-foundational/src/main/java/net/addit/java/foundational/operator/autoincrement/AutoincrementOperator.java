package net.addit.java.foundational.operator.autoincrement;

/**
 * 自增运算符
 *
 * @author tony 241963698@qq.com
 * @version 2022/6/26 下午3:31
 * @since JDK8
 */
public class AutoincrementOperator {
    public static void main(String[] args) {
        int number=10;
        number++;
        System.out.println("number="+number);
        ++number;
        System.out.println("number="+number);
    }
}

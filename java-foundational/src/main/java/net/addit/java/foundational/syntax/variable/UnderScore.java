package net.addit.java.foundational.syntax.variable;

/**
 * Java7新特性之数字之间使用下划线
 *
 * @author tony 241963698@qq.com
 * @version 2022/6/25 下午2:01
 * @since JDK8
 */
public class UnderScore {
    public static void main(String[] args) {
        long longval=100_000_000_000L;
        System.out.println(longval);

        double dblval=3.141_59_26;
        System.out.println(dblval);
    }
}

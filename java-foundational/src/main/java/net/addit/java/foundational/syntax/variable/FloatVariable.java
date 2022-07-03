package net.addit.java.foundational.syntax.variable;

/**
 * 浮点类型变量的定义和使用
 *
 * @author tony 241963698@qq.com
 * @version 2022/6/25 下午2:11
 * @since JDK8
 */
public class FloatVariable {
    public static void main(String[] args) {
        float floatval=3.14F;
        double dblval=3.14;

        System.out.println(floatval);
        System.out.println(dblval);

        //浮点数计算有精度损失
        System.out.println(2.0-1.1);

        double value=314E-2;
        System.out.println("value="+value);

        value=100E3;
        System.out.println("value="+value);
    }
}

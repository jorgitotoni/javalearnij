package net.addit.java.foundational.syntax.conversion;

/**
 * 强制类型转换
 *
 * @author tony 241963698@qq.com
 * @version 2022/6/25 下午10:29
 * @since JDK8
 */
public class NarrowConversion {
    public static void main(String[] args) {
        //取值范围较小的数据类型 变量名 = （取值范围较小的数据类型） 取值范围较大的数据类型的数值
        double salary=10000.0;
        System.out.println("salary"+salary);
        int intSalary=(int)salary;
        System.out.println("int salary"+intSalary);
    }
}

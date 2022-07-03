package net.addit.java.foundational.syntax.conversion;

/**
 * 类型转换注意事项
 *
 * @author tony 241963698@qq.com
 * @version 2022/6/26 下午2:08
 * @since JDK8
 */
public class TypeConversionWarning {
    public static void main(String[] args) {
        //强制类型转换会损失精度
        double salary = 10000.88;
        System.out.println("salary=" + salary);
        int intSalary = (int) salary;
        System.out.println("intSalary=" + intSalary);

        //强制类型转换可能会溢出
        //byte的范围是 -128 - +127
        byte byteVar = (byte) 128;
        System.out.println("byte128=" + byteVar);
        byteVar = (byte) 130;
        System.out.println("byte130=" + byteVar);

        //byte short char类型运算（+）的时候会先提升为int类型再运算
        short shortLeft=100;
        short shortRight=100;
//        short shortResult=shortLeft+shortRight;
        int intResult=shortLeft+shortRight;
        System.out.println("intResult="+intResult);
        short shortResult=(short)(shortLeft+shortRight);
        System.out.println("shortResult="+shortResult);


    }
}

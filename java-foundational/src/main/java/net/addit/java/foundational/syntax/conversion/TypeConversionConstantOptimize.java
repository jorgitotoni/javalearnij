package net.addit.java.foundational.syntax.conversion;

/**
 * 类型转换的常量优化机制
 *
 * @author tony 241963698@qq.com
 * @version 2022/6/26 下午2:24
 * @since JDK8
 */
public class TypeConversionConstantOptimize {
    public static void main(String[] args) {
        //变量运算会先提升类型，字面量计算会先计算
        short shortLeft=100;
        short shortRight=100;
//        short shortResult=shortLeft+shortRight;
        int intResult=shortLeft+shortRight;
        System.out.println("intResult="+intResult);
        short shortResult=(short)(shortLeft+shortRight);
        System.out.println("shortResult="+shortResult);

        short shortVar=3+4;
        System.out.println("shortVar="+shortVar);

    }
}

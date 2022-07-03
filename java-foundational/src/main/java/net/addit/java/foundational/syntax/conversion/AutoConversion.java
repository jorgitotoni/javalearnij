package net.addit.java.foundational.syntax.conversion;

/**
 * 7种基本数据类型的自动转换
 * byte<short<int<long<float<double
 * char<int<long<float<double
 * @author tony 241963698@qq.com
 * @version 2022/6/25 下午9:36
 * @since JDK8
 */
public class AutoConversion {
    public static void main(String[] args) {
        //获取float类型的最大值赋值给fltMax变量
        float fltMax=Float.MAX_VALUE;
        System.out.println("fltMax"+fltMax);
        System.out.printf("单精度浮点类型表示的最大值是%.2f\n",fltMax);

        //获取long类型的最大值
        long longMax=Long.MAX_VALUE;
        System.out.println("long类型的最大值是"+longMax);

        //long自动转换成float类型
        long longVar=100L;
        System.out.println("longVar="+longVar);
        float fltVar;
        fltVar=longVar;
        System.out.println("fltVar="+fltVar);

        //char类型的取值范围
        char charMin=Character.MIN_VALUE;
        char charMax=Character.MAX_VALUE;
        System.out.println("char类型取值最小值为"+(int)charMin);
        System.out.println("char类型取值最大值为"+(int)charMax);

        //char类型自动转换成int类型
        int intVar=100;
        intVar=charMax;
        //如果反过来，charMax=intVar会出编译错误
        System.out.println("int类型"+intVar);

        //short和char不能相互转换
        short shortVar=100;
//        shortVar=charMax;
//        charMax=shortVar;
    }
}

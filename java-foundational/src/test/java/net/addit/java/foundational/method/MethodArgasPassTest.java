package net.addit.java.foundational.method;

import java.util.Arrays;

/**
 * 方法的参数传递机制测试
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/10 下午4:41
 * @since JDK8
 */
public class MethodArgasPassTest {
    public static void main(String[] args) {
        System.out.println("****************基本参数类型的参数传递机制****************");
        int number=10;
        System.out.println("1.实参 number="+number);
        MethodArgsPass.change(number);
        System.out.println("2.实参 number="+number);
        System.out.println("****************基本参数类型的参数传递机制****************");
        System.out.println("****************引用参数类型的参数传递机制-修改内存****************");
        int[] numbers={1,2,3};
        System.out.println("1.实参的内存地址是"+numbers);
        MethodArgsPass.change(numbers);
        System.out.println("2.实参的内存地址是"+numbers);
        System.out.println("****************引用参数类型的参数传递机制-修改内存****************");
        System.out.println("****************引用参数类型的参数传递机制-修改内容****************");
        char[] chars={'x','y','k'};
        System.out.println("1.实参的内容是"+ Arrays.toString(chars));
        MethodArgsPass.change(chars);
        System.out.println("2.实参的内容是"+ Arrays.toString(chars));
        System.out.println("****************引用参数类型的参数传递机制-修改内容****************");

    }
}

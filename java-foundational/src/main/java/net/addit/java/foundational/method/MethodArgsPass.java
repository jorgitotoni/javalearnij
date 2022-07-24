package net.addit.java.foundational.method;

import java.util.Arrays;

/**
 * 方法的参数传递机制
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/10 下午4:39
 * @since JDK8
 */
public class MethodArgsPass {
    public static void change(int number){
        System.out.println("1.形参 number="+number);

        number=100;

        System.out.println("2.形参 number="+number);

    }

    public static void change(int[] numbers){
        System.out.println("1.形参的内存地址是"+numbers);
        numbers=new int[]{10,20,30};
        System.out.println("2.形参的内存地址是"+numbers);

    }

    public static void change(char[] chars){
        System.out.println("1.形参的内容是"+ Arrays.toString(chars));
        chars[0]='z';
        System.out.println("2.形参的内容是"+ Arrays.toString(chars));


    }
}

package net.addit.java.foundational.operator.arithmetic;

import java.util.Scanner;

/**
 * 整数反转案例代码
 *
 * @author tony 241963698@qq.com
 * @version 2022/6/26 下午3:42
 * @since JDK8
 */
public class NumberInversion {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入一个四位整数：");
        int number=input.nextInt();
        System.out.println("输入的四位整数是"+number);

        int thousand=number/1000%10;
        int hundred=number/100%10;
        int decade=number/10%10;
        int unit=number%10;

        int numberInversed=unit*1000+decade*100+hundred*10+thousand;
        System.out.println("转换后的数字是："+numberInversed);

    }
}

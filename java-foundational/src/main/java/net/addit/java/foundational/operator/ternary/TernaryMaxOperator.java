package net.addit.java.foundational.operator.ternary;

import java.util.Scanner;

/**
 * 三元运算符求三个整数的最大值
 *
 * @author tony 241963698@qq.com
 * @version 2022/6/27 下午1:37
 * @since JDK8
 */
public class TernaryMaxOperator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int left=input.nextInt();
        System.out.println("请输入第二个整数：");
        int middle=input.nextInt();
        System.out.println("请输入第三个整数：");
        int right=input.nextInt();

        System.out.printf("第一个整数：%d 第二个整数：%d 第三个整数：%d",left,middle,right);

        int tempMax=left>middle?left:middle;
        int max=tempMax>right?tempMax:right;
//        int max=(left>middle?left:middle)>right?(left>middle?left:middle):right;
        System.out.println("三个整数的最大值是： "+max);


    }
}

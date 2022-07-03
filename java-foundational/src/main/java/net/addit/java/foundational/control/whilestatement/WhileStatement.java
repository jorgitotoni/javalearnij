package net.addit.java.foundational.control.whilestatement;

import java.util.Scanner;

/**
 * while循环的应用
 *
 * @author tony 241963698@qq.com
 * @version 2022/6/30 下午1:21
 * @since JDK8
 */
public class WhileStatement {
    public static void main(String[] args) {
        //读取用户键盘输入的正整数和负整数的个数，输入0退出
        Scanner input=new Scanner(System.in);
        int num=1;
        int positiveCount=0;
        int negativeCount=0;
        while (num!=0){
            System.out.println("请输入一个整数：");
            num=input.nextInt();
            if(num>0){
                positiveCount++;
            }else if(num<0){
                negativeCount++;
            }
        }
        System.out.println("正整数共有："+positiveCount);
        System.out.println("负整数共有："+negativeCount);

        int i=100;
        int countTriple=0;
        while (i<1000){
            int hundred=i/100%10;
            int ten=i/10%10;
            int unit=i%10;
            int triple=hundred*hundred*hundred+ten*ten*ten+unit*unit*unit;
            if(i==triple){
                countTriple++;
                System.out.println(i);
            }
            i++;
        }
        System.out.println("水仙花数共有："+countTriple);
    }
}

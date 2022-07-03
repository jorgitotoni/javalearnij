package net.addit.java.foundational.control.switchstatement;

import java.util.Scanner;

/**
 * Switch语句的应用
 *
 * @author tony 241963698@qq.com
 * @version 2022/6/29 下午10:42
 * @since JDK8
 */
public class SwitchCaseStatement {
    public static void main(String[] args) {
        //用户输入数字，输出对应的星期
        Scanner input=new Scanner(System.in);
        System.out.println("请输入数字：");
        int number=input.nextInt();

        switch(number){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong number");
                break;
        }
    }
}

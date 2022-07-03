package net.addit.java.foundational.control.ifstatement;

import java.util.Scanner;

/**
 * if分支结构
 *
 * @author tony 241963698@qq.com
 * @version 2022/6/29 下午12:20
 * @since JDK8
 */
public class ifstatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你的年龄：");
        int age=input.nextInt();
        if(age>=18){
            System.out.println("你已经成年了，可以进入网吧。");
        }

        if(age%2==0){
            System.out.println("是偶数");
        }else{
            System.out.println("是奇数");
        }

        if(age>=60){
            System.out.println("老年");
        }else if(age>=40 && age<60){
            System.out.println("中年");
        }else if(age>=20 && age<40){
            System.out.println("青年");
        }else if(age>=10 && age<20){
            System.out.println("少年");
        }else if(age>0 && age<10) {
            System.out.println("幼年");
        }else{
                System.out.println("年龄有误");
            }
        }
    }


package net.addit.java.api.lang;

import java.util.Scanner;

/**
 * 字符串统计
 *
 * @author tony 241963698@qq.com
 * @version 2022/8/5 下午1:38
 * @since JDK11
 */
public class StringStatisticsTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入一段字符串：");

        String str=input.next();

        int upperCaseCount=0;
        int lowerCaseCount=0;
        int numberCount=0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                upperCaseCount++;
            }else if(Character.isLowerCase(ch)){
                lowerCaseCount++;
            }else if(Character.isDigit(ch)){
                numberCount++;
            }
        }
        System.out.printf("你输入的字符串是%s，大写字母的个数是%d，小写字母的个数是%d，数字个数是%d",str,upperCaseCount,lowerCaseCount,numberCount);
    }
}

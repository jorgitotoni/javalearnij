package net.addit.java.api.lang;

import java.util.Scanner;

/**
 * 字符串反转
 *
 * @author tony 241963698@qq.com
 * @version 2022/8/5 下午1:45
 * @since JDK11
 */
public class StringReverseTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入一段字符串：");

        String str=input.next();
        char[] descs=new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            descs[str.length()-i-1]=str.charAt(i);
        }
        String desc=new String(descs);
        System.out.printf("你输入的字符串是%s，反转后的字符串是%s",str,desc);
    }
}

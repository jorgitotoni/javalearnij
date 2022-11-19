package net.addit.java.api.lang;

import net.addit.java.api.lang.exception.RegisterException;

import java.util.Scanner;

/**
 * 注册异常的测试用例
 *
 * @author tony 241963698@qq.com
 * @version 2022/10/7 下午7:34
 * @since JDK11
 */
public class RegisterExceptionUsageTest {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入您的用户名：");
        String userName=input.nextLine();
        if(userName.equals("tony")){
            try {
                throw new RegisterException("用户名已经存在");
            } catch (RegisterException e) {
                System.out.println("请更换用户名后重试");
            } finally {
                input.close();
            }
        }else{
            System.out.println("用户注册成功");
        }
    }
}

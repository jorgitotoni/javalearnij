package net.addit.java.foundational.oop.permission.service.impl;

/**
 * 继承访问权限测试
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/18 下午12:53
 * @since JDK8
 */
public class ProtectedTest {
    public static void main(String[] args) {
        AppUserService appUserService=new AppUserService();
        //appUserService.login();
        appUserService.register();
    }
}

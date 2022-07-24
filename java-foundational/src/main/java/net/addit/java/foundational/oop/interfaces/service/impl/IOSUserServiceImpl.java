package net.addit.java.foundational.oop.interfaces.service.impl;

/**
 * iOS用户服务实现
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/23 下午12:26
 * @since JDK8
 */
public class IOSUserServiceImpl extends AppUserServiceImpl{
    @Override
    public void register() {
        System.out.println("ios app用户注册成功");
    }

    @Override
    public void login() {
        System.out.println("ios app用户登录成功");
    }
}

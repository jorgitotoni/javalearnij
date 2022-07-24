package net.addit.java.foundational.oop.interfaces.service.impl;

import net.addit.java.foundational.oop.interfaces.service.CommonUserService;
import net.addit.java.foundational.oop.interfaces.service.UserService;

/**
 * android用户服务实现
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/23 下午12:23
 * @since JDK8
 */
public class AndroidUserServiceImpl extends AppUserServiceImpl {
    @Override
    public void register() {
        System.out.println("android app用户注册成功");
    }

    @Override
    public void login() {
        System.out.println("android app用户登录成功");

    }
}

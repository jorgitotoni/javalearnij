package net.addit.java.foundational.oop.interfaces.service.impl;

import net.addit.java.foundational.oop.interfaces.service.CommonUserService;
import net.addit.java.foundational.oop.interfaces.service.LogService;
import net.addit.java.foundational.oop.interfaces.service.UserService;

/**
 * app用户服务实现
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/23 下午12:21
 * @since JDK8
 */
public class AppUserServiceImpl extends CommonUserService implements UserService, LogService {
    @Override
    public void register() {
        System.out.println("app用户注册成功");
    }

    @Override
    public void login() {
        log();
        System.out.println("app用户登录成功");

    }

    @Override
    public void log() {
        System.out.println("记录app用户操作日志成功");
    }
}

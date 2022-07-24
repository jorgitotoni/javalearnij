package net.addit.java.foundational.oop.permission.service.impl;

import net.addit.java.foundational.oop.permission.service.CommonUserService;

/**
 * App端用户服务
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/18 下午12:53
 * @since JDK8
 */
public class AppUserService extends CommonUserService {
    @Override
    protected void register() {
        System.out.println("欢迎App用户注册crm网");
    }
}

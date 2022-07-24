package net.addit.java.foundational.oop.permission.service;

/**
 * 通用的用户服务
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/18 下午12:44
 * @since JDK8
 */
public class CommonUserService {
    /**
     * 用户登录
     */
    void login(){
        System.out.println("欢迎登录crm网");
        statistics();
    }

    /**
     * 统计用户登录信息
     */
    private void statistics(){
        System.out.println("统计当前登录用户的登录信息  IP，地址，次数，PC/app");
    }

    protected void register(){
        System.out.println("欢迎注册crm网");
    }
}

package net.addit.java.foundational.oop.interfaces.service.impl;

import net.addit.java.foundational.oop.interfaces.service.CommonUserService;
import net.addit.java.foundational.oop.interfaces.service.UserService;

/**
 * PC用户服务实现
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/23 上午11:26
 * @since JDK8
 */
public class PCUserServiceImpl extends CommonUserService implements UserService {


    @Override
    public void login() {
        getSecurityService().securityCheck();
        System.out.println("PC用户登录成功");
    }

    @Override
    public void resetPassword() {
        System.out.println("您的密码重置成功");
    }

    @Override
    public void register() {
        //组合+继承一起使用
        getSecurityService().securityCheck();
        boolean result=getValidationService().validation("jack");
        if(result){
            System.out.println("PC用户登录成功");

        }else{
            System.out.println("PC用户登录失败");

        }
    }
}

package net.addit.java.foundational.oop.enums;

import net.addit.java.foundational.oop.interfaces.service.UserService;
import net.addit.java.foundational.oop.interfaces.service.impl.AndroidUserServiceImpl;
import net.addit.java.foundational.oop.interfaces.service.impl.IOSUserServiceImpl;
import net.addit.java.foundational.oop.interfaces.service.impl.PCUserServiceImpl;

/**
 * handleRegister
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/28 下午2:25
 * @since JDK11
 */
public class RegisterSourceComponent {

    UserService userService;

    /**
     * 注册组件：处理注册来源
     * @param registerSource
     */
    public void handleRegisterSource(RegisterSource registerSource){
        switch (registerSource){
            case PC:
                userService=new PCUserServiceImpl();
                break;
            case ANDROID_APP:
                userService=new AndroidUserServiceImpl();
                break;
            case IOS_APP:
                userService=new IOSUserServiceImpl();
                break;
            case UNKNOWN:
                System.out.println("不明来源的注册渠道，本系统不处理");
                break;
        }
        userService.register();

    }
}

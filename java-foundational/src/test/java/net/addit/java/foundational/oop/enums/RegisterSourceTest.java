package net.addit.java.foundational.oop.enums;

import net.addit.java.foundational.oop.interfaces.service.UserService;
import net.addit.java.foundational.oop.interfaces.service.impl.AndroidUserServiceImpl;
import net.addit.java.foundational.oop.interfaces.service.impl.IOSUserServiceImpl;
import net.addit.java.foundational.oop.interfaces.service.impl.PCUserServiceImpl;

/**
 * 枚举的案例
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/28 下午2:20
 * @since JDK11
 */
public class RegisterSourceTest {


    public static void main(String[] args) {
        RegisterSourceComponent registerSourceComponent=new RegisterSourceComponent();
        registerSourceComponent.handleRegisterSource(RegisterSource.PC);
    }
}

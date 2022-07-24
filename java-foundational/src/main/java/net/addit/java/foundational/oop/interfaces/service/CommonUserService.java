package net.addit.java.foundational.oop.interfaces.service;

import net.addit.java.foundational.oop.interfaces.service.impl.SecurityServiceImpl;
import net.addit.java.foundational.oop.interfaces.service.impl.ValidationServiceImpl;

/**
 * 一般用户服务
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/23 下午12:21
 * @since JDK8
 */
public abstract class CommonUserService {
    /**
     * 组合网络安全服务
     */
    protected final SecurityService securityService=new SecurityServiceImpl();
    /**
     * 组合校验服务
     */
    protected final ValidationService validationService=new ValidationServiceImpl();

    public SecurityService getSecurityService() {
        return securityService;
    }

    public ValidationService getValidationService() {
        return validationService;
    }
}

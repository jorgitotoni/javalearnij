package net.addit.java.foundational.oop.interfaces.service.impl;

import net.addit.java.foundational.oop.interfaces.service.SecurityService;

/**
 * 安全服务实现
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/23 下午2:08
 * @since JDK8
 */
public class SecurityServiceImpl implements SecurityService {

    @Override
    public void securityCheck() {
        System.out.println("网络安全检查通过");
    }
}

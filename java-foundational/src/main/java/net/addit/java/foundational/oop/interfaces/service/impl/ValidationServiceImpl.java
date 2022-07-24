package net.addit.java.foundational.oop.interfaces.service.impl;

import net.addit.java.foundational.oop.interfaces.service.ValidationService;

/**
 * 校验服务实现
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/23 下午2:18
 * @since JDK8
 */
public class ValidationServiceImpl implements ValidationService {
    @Override
    public boolean validation(String userName) {
        if("tony".equals(userName)){
            return false;
        }
        return true;
    }
}

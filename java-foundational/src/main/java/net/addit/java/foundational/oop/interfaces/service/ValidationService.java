package net.addit.java.foundational.oop.interfaces.service;

/**
 * 校验服务
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/23 下午2:17
 * @since JDK8
 */
public interface ValidationService {
    /**
     * 校验注册的用户名是否存在
     * @param userName
     * @return
     */
    boolean validation(String userName);
}

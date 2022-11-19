package net.addit.java.foundational.oop.interfaces.service;

/**
 * 鼠标
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/25 下午1:20
 * @since JDK11
 */
public class Mouse implements USB{
    @Override
    public String getDeviceInfo() {
        return "罗技鼠标";
    }
}

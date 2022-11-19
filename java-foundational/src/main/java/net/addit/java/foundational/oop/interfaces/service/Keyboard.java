package net.addit.java.foundational.oop.interfaces.service;

/**
 * 键盘
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/25 下午1:21
 * @since JDK11
 */
public class Keyboard implements USB{
    @Override
    public String getDeviceInfo() {
        return "罗技键盘";
    }
}

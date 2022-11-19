package net.addit.java.foundational.oop.interfaces.service;

/**
 * 硬盘
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/25 下午1:25
 * @since JDK11
 */
public class HardDisk implements USB{
    @Override
    public String getDeviceInfo() {
        return "希捷硬盘";
    }
}

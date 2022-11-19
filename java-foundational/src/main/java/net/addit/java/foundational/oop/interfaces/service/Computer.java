package net.addit.java.foundational.oop.interfaces.service;

/**
 * 电脑
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/25 下午1:19
 * @since JDK11
 */
public class Computer {
    public void showComputerUSBDeviceInfo(USB usb1,USB usb2){
        System.out.println("电脑的第一个USB接口连接的设备是"+usb1.getDeviceInfo());
        System.out.println("电脑的第二个USB接口连接的设备是"+usb2.getDeviceInfo());

    }
}

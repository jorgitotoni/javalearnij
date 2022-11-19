package net.addit.java.foundational.oop.interfaces.service;

/**
 * 接口做形参的测试用例
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/25 下午1:23
 * @since JDK11
 */
public class ComputerTest {
    public static void main(String[] args) {
        Computer computer=new Computer();

        USB usb1=new Mouse();
        //USB usb2=new Keyboard();
        USB usb2=new HardDisk();

        computer.showComputerUSBDeviceInfo(usb1,usb2);
    }
}

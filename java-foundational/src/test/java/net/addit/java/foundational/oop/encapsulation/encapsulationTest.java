package net.addit.java.foundational.oop.encapsulation;

/**
 * 属性封装的测试
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/16 下午10:09
 * @since JDK8
 */
public class encapsulationTest {
    public static void main(String[] args) {
        Cellphone cellphone=new Cellphone();
        //访问对象的成员变量
        cellphone.setModel("三星S22 ultra");
        System.out.println("手机的型号是"+cellphone.getModel());
        cellphone.setModel("小米12");
        System.out.println("手机的型号是"+cellphone.getModel());
        cellphone.setPrice(-3333);
        System.out.println("手机的价格是"+cellphone.getPrice());
    }
}

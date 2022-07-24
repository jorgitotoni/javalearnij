package net.addit.java.foundational.oop.inheritance;

/**
 * Object类的测试用例
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/17 下午5:26
 * @since JDK8
 */
public class ObjectTest {
    public static void main(String[] args) {
        SmartPhone smartPhone=new SmartPhone("iphone12");
        smartPhone.setWirelessCharging(true);
        //System.out.println(smartPhone.toString());
        System.out.println(smartPhone);

        SmartPhone iphone12=new SmartPhone();
        iphone12.setModel("iphone12");
        iphone12.setWirelessCharging(true);

        boolean result=smartPhone.equals(iphone12);
        System.out.println("equals()方法的执行结果："+result);
    }
}

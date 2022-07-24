package net.addit.java.foundational.oop.inheritance;

/**
 * 继承的测试用例
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/17 下午3:53
 * @since JDK8
 */
public class InheritanceTest {
    public static void main(String[] args) {
        SmartPhone smartPhone=new SmartPhone();
        smartPhone.call(13810432885L);

        SmartPhone iphone12=new SmartPhone("iphone12");
        System.out.println("智能手机iphone12的型号是"+iphone12.getModel());

        smartPhone.playVideo(iphone12.getModel());

    }
}

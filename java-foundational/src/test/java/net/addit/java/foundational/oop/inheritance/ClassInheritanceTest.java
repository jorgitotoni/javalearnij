package net.addit.java.foundational.oop.inheritance;

/**
 * 类继承的内存机制
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/18 下午1:30
 * @since JDK8
 */
public class ClassInheritanceTest {
    public static void main(String[] args) {
        SmartPhone smartPhone=new SmartPhone();
        smartPhone.setModel("iphone12");
        smartPhone.playVideo(smartPhone.getModel());
        smartPhone.sendMessage(13810432885L,"hello world");
    }
}

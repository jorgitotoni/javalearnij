package net.addit.java.foundational.oop.encapsulation;

/**
 * this关键字的使用
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/16 下午10:23
 * @since JDK8
 */
public class thisTest {
    public static void main(String[] args) {
        Cellphone noArgs=new Cellphone();
        System.out.println("noArgs"+noArgs);

        Cellphone xiaomi=new Cellphone();
        System.out.println("xiaomi"+xiaomi);
    }
}

package net.addit.java.foundational.oop.innerclass;

/**
 * 静态内部类单例模式测试用例
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/27 下午1:28
 * @since JDK11
 */
public class StaticInnerClassSingletonTest {
    public static void main(String[] args) {
        StaticInnerClassSingleton staticInnerClassSingleton=StaticInnerClassSingleton.getInstance();
        System.out.println(staticInnerClassSingleton);
        System.out.println(StaticInnerClassSingleton.getInstance());
        System.out.println(StaticInnerClassSingleton.getInstance());
        System.out.println(StaticInnerClassSingleton.getInstance());
        System.out.println(StaticInnerClassSingleton.getInstance());
    }
}

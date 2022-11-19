package net.addit.java.foundational.oop.initialization;

/**
 * 类的成员初始化顺序的测试用例
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/28 下午1:27
 * @since JDK11
 */
public class ClassMemberInitializationOrderTest {
    public static void main(String[] args) {
        new SubClass();
        SubClass.InnerClass innerClass=new SubClass.InnerClass();
    }
}

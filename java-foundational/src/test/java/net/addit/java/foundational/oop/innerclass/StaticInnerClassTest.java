package net.addit.java.foundational.oop.innerclass;

/**
 * 静态内部类的测试用例
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/27 下午1:20
 * @since JDK11
 */
public class StaticInnerClassTest {
    public static void main(String[] args) {
        //创建静态内部类对象
        StaticInnerClass.InnerClass innerClass=new StaticInnerClass.InnerClass();
        //调用静态内部类对象的方法
        innerClass.showStaticMemberInfo(30);
    }
}

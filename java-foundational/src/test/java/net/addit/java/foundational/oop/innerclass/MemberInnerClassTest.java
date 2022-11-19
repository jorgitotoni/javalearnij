package net.addit.java.foundational.oop.innerclass;

/**
 * 成员内部类测试用例
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/27 下午1:10
 * @since JDK11
 */
public class MemberInnerClassTest {
    public static void main(String[] args) {
        //创建外部类对象
        MemberInnerClass memberInnerClass=new MemberInnerClass("外部类");
        //通过外部类对象创建内部类对象
        MemberInnerClass.InnerClass innerClass=memberInnerClass.new InnerClass("内部类");
        innerClass.showMemberInfo("形参");
    }
}

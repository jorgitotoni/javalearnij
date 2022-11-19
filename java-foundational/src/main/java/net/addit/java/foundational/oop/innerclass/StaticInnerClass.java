package net.addit.java.foundational.oop.innerclass;

/**
 * 静态内部类
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/27 下午1:17
 * @since JDK11
 */
public class StaticInnerClass {
    static int count=10;

    static class InnerClass{
        static int count=20;

        public void showStaticMemberInfo(int count){
            System.out.println("形参 count="+count);
            System.out.println("内部类成员变量 count="+InnerClass.count);
            System.out.println("外部类成员变量 count="+StaticInnerClass.count);
        }
    }
}

package net.addit.java.foundational.oop.initialization;

/**
 * 父类成员的初始化机制
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/28 下午1:46
 * @since JDK11
 */
public class SuperClass {
    /**
     * 无参构造方法
     */
    public SuperClass(){
        System.out.println("5.父类执行无参的构造方法");
        //System.out.println("staticVariable="+SuperClass.staticVariable);
        //System.out.println("memberVariable="+this.memberVariable);
    }

    //构造代码块
    {
        System.out.println("3.父类执行构造代码块");
        //System.out.println("memberVariable="+this.memberVariable);
    }

    //静态代码块
    static{
        System.out.println("1.父类执行静态代码块");
        //System.out.println("StaticVariable="+SuperClass.staticVariable);
    }

    //成员变量
    private String memberVariable=initMemberVariable();

    private String initMemberVariable() {
        System.out.println("4.父类执行显示初始化成员变量赋值");
        return "我是一个成员变量";
    }

    private static String staticVariable=initStatiVariable();

    private static String initStatiVariable() {
        System.out.println("2.父类执行显示初始化静态成员变量赋值");
        return "我是一个静态变量";
    }

    static class InnerClass{
        static{
            System.out.println("6.执行父类的静态内部类的静态代码块");
        }
    }
}

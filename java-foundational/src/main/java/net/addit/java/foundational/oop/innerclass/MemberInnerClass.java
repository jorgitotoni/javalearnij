package net.addit.java.foundational.oop.innerclass;

/**
 * 成员内部类
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/27 下午1:06
 * @since JDK11
 */
public class MemberInnerClass {
    private String name;

    public MemberInnerClass(String name){
        this.name=name;
    }

    class InnerClass{
        private String name;

        public InnerClass(String name){
            this.name=name;
        }

        /**
         * 查看成员信息
         * @param name
         */
        public void showMemberInfo(String name){
            System.out.println("形参 name="+name);
            System.out.println("内部类成员变量 name="+this.name);
            System.out.println("外部类成员变量 name="+MemberInnerClass.this.name);

        }
    }
}

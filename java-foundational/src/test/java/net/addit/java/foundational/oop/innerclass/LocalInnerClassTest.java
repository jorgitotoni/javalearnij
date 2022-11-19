package net.addit.java.foundational.oop.innerclass;

/**
 * 局部内部类测试用例
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/27 下午1:34
 * @since JDK11
 */
public class LocalInnerClassTest {
    public static void main(String[] args) {

        int number=10;

        class InnerClass{
            private String name;
            InnerClass(String name){
                this.name=name;
            }
            public void showLocalMemberInfo(){
                System.out.println(this.name);
                System.out.println("main()方法的局部变量 number="+number);
            }
        }

        InnerClass innerClass=new InnerClass("局部内部类");
        innerClass.showLocalMemberInfo();
    }
}

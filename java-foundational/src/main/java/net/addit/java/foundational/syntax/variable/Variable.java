package net.addit.java.foundational.syntax.variable;

/**
 * 变量的定义和使用
 *
 * @author tony 241963698@qq.com
 * @version 2022/6/25 下午12:10
 * @since JDK8
 */
public class Variable {
    public static void main(String[] args) {

        //变量定义的格式：变量类型 变量名=变量值；
        //定义的时候有初始化赋值
        int age=29;
        System.out.println(age);
        age=30;
        System.out.println(age);

        //变量的声明：变量类型 变量名；
        int value;
        //变量的赋值：变量名=变量值；
        //main函数内的变量叫局部变量，局部变量需要赋值后才能使用
        value=1000;
        System.out.println(value);
    }
}

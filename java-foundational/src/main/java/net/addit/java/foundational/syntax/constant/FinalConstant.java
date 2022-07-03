package net.addit.java.foundational.syntax.constant;

/**
 * final常量
 *
 * @author tony 241963698@qq.com
 * @version 2022/6/25 下午5:32
 * @since JDK8
 */
public class FinalConstant {
    public static void main(String[] args) {
        final int NUMBER=10;
        System.out.println(NUMBER);
        //再次赋值会出错
    }
}

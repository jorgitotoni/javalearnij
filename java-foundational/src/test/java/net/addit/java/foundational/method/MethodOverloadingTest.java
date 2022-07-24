package net.addit.java.foundational.method;

/**
 * 方法重载测试
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/9 下午1:51
 * @since JDK8
 */
public class MethodOverloadingTest {
    public static void main(String[] args) {
        System.out.println(MethodOverloading.compare(100,100));
        System.out.println(MethodOverloading.compare(100L,100L));
        System.out.println(MethodOverloading.compare("abc","abc"));
    }
}

package net.addit.java.foundational.oop.enums;

/**
 * 枚举的测试用例
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/28 下午1:59
 * @since JDK11
 */
public class EnumTest {
    public static void main(String[] args) {
        Season spring=Season.SPRING;
        System.out.println(spring);

        spring=Season.getSeasonByDescription("春天");
        System.out.println(spring.getDescription());
    }
}

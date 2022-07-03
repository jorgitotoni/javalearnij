package net.addit.java.foundational.array;

/**
 * 数组的静态初始化
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/3 下午5:57
 * @since JDK8
 */
public class ArrayStaticInit {
    public static void main(String[] args) {
        //标准初始化格式：
        int[] numbers=new int[]{10,20,30};
        System.out.println("访问整数数组的第0个元素是："+numbers[0]);
        //简化格式：
        char[] chars={'a','b','c'};
        System.out.println("访问字符数组第1个元素是："+chars[1]);

    }
}

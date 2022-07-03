package net.addit.java.foundational.array;

/**
 * 数组的动态初始化
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/3 下午6:49
 * @since JDK8
 */
public class ArrayDynamicInit {
    public static void main(String[] args) {
        int[] numbers=new int[3];

        System.out.println(numbers);
        /*
        [I@6e0be858
        I 表示是整数类型
        @ 是分隔符
        6e0be858 是十六进制哈希值
         */

        System.out.println("number数组第0个元素值是："+numbers[0]);

        char[] chars=new char[3];
        double[] dbls=new double[3];
        boolean[] bls=new boolean[3];
        System.out.println("chars数组第0个元素值是："+chars[0]);
        System.out.println("double数组第0个元素值是："+dbls[0]);
        System.out.println("boolean数组第0个元素值是："+bls[0]);

    }
}

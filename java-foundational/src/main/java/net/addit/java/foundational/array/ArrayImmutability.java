package net.addit.java.foundational.array;

/**
 * 数组不可变性
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/3 下午9:13
 * @since JDK8
 */
public class ArrayImmutability {
    public static void main(String[] args) {
        int[] scores=new int[]{100,90,80};
        System.out.println("scores第一次初始化内存是：" +scores);
        //I@6e0be858
        scores=new int[]{100,90,80,95,75};
        System.out.println("scores扩容后的内存是："+scores);
        //I@61bbe9ba
    }
}

package net.addit.java.foundational.array;

/**
 * 数组两个引用指向同一个数组
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/3 下午9:25
 * @since JDK8
 */
public class ArrayAssignment {
    public static void main(String[] args) {
        int[] source=new int[]{10,20,30};
        System.out.println("原数组为："+source);
        //I@6e0be858
        int[] target=source;
        System.out.println("新数组为："+target);
        //I@6e0be858
        System.out.println("修改前原数组第0个元素为："+source[0]);
        System.out.println("修改前新数组第0个元素为："+target[0]);
        target[0]=100;
        System.out.println("修改后原数组第0个元素为："+source[0]);
        System.out.println("修改后新数组第0个元素为："+target[0]);
    }
}

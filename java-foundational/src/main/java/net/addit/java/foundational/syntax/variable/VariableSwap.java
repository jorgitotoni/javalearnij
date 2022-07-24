package net.addit.java.foundational.syntax.variable;

/**
 * 变量交换
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/4 下午1:18
 * @since JDK8
 */
public class VariableSwap {
    public static void main(String[] args) {
        //中间变量变换
        int left=10;
        int right=20;
        System.out.println("交换之前，left="+left+" right="+right);
        int temp=left;
        left=right;
        right=temp;
        System.out.println("交换之后，left="+left+" right="+right);
        //算数运算变换
        left=10;
        right=20;
        System.out.println("交换之前，left="+left+" right="+right);
        left=left+right;
        right=left-right;
        left=left-right;
        System.out.println("交换之后，left="+left+" right="+right);
        //位运算：异或交换
        left=10;
        right=20;
        System.out.println("交换之前，left="+left+" right="+right);
        left=left^right;
        right=left^right;
        left=left^right;
        System.out.println("交换之后，left="+left+" right="+right);
    }
}

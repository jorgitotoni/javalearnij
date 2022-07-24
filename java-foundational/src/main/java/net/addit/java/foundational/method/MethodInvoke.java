package net.addit.java.foundational.method;

/**
 * 有返回值的方法的定义和使用
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/8 下午1:20
 * @since JDK8
 */
public class MethodInvoke {
    public static void main(String[] args) {
        //赋值调用
        int result=add(1,2);
        System.out.println(result);

        //输出调用
        System.out.println(add(10,20));
    }

    /**
     * 实现两个整数相加
     * @param left 第一个操作数（形参）
     * @param right 第二个操作数（形参）
     * @return 两个整数相加的结果
     */
    public static int add(int left,int right){

        return left+right;
    }
}

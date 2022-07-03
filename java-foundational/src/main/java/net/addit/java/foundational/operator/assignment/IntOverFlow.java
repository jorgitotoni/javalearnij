package net.addit.java.foundational.operator.assignment;

/**
 * 整数溢出的内存原理
 *
 * @author tony 241963698@qq.com
 * @version 2022/6/28 下午12:07
 * @since JDK8
 */
public class IntOverFlow {
    public static void main(String[] args) {
        byte value=(byte)135;
        /*
        135 默认是int类型，4字节，二进制补码为 0000 0000 0000 0000 0000 0000 1000 0111
        强制转换为byte类型，1字节，二进制补码为 1000 0111，转换为反码为 1000 0110 转换原码为 1111 1001 =-121
         */
        System.out.println("value="+value);
    }
}

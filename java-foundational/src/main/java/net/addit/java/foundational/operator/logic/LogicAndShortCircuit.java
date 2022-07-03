package net.addit.java.foundational.operator.logic;

/**
 * 短路与
 *
 * @author tony 241963698@qq.com
 * @version 2022/6/27 下午12:42
 * @since JDK8
 */
public class LogicAndShortCircuit {
    public static void main(String[] args) {
        int left=10;
        int right=20;

        boolean flag =left++>10 && right--<20;
        System.out.println("left="+left);
        System.out.println("right="+right);
        System.out.println("flag="+flag);
    }
}

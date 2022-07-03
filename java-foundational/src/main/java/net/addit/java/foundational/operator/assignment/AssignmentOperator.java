package net.addit.java.foundational.operator.assignment;

/**
 * 赋值运算符的使用
 *
 * @author tony 241963698@qq.com
 * @version 2022/6/26 下午5:31
 * @since JDK8
 */
public class AssignmentOperator {
    public static void main(String[] args) {
        int number=10;
        //扩展赋值运算符 +=,-=,*=,/=,%=
        int left=20;
        int right=3;
        left+=right;
        System.out.println(left);
        System.out.println(right);
    }
}

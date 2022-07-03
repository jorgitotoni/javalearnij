package net.addit.java.foundational.operator.arithmetic;

/**
 * 算数运算符
 *
 * @author tony 241963698@qq.com
 * @version 2022/6/26 下午3:14
 * @since JDK8
 */
public class Arithmetic {
    public static void main(String[] args) {
        System.out.println(10+20);

        int left=20;
        int right=3;
        System.out.printf("%d+%d=%d\n",left,right,left+right);
        System.out.printf("%d-%d=%d\n",left,right,left-right);
        System.out.printf("%d*%d=%d\n",left,right,left*right);
        System.out.printf("%d/%d=%d\n",left,right,left/right);
        System.out.printf("%d%%%d=%d\n",left,right,left%right);

        char ch='a';
        int result=ch+left+right;
        System.out.printf("%d+%d+%d=%d",(int)ch,left,right,result);

    }
}

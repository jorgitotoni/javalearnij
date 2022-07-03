package net.addit.java.foundational.operator.ternary;

/**
 * 三元运算符使用注意事项
 *
 * @author tony 241963698@qq.com
 * @version 2022/6/27 下午12:54
 * @since JDK8
 */
public class TernaryWarning {
    public static void main(String[] args) {
        double result=true?12:100.0;
        System.out.println("result= "+result);

//        int value=true?100:12.0;
        int value=true?100:(int)12.0;
        System.out.println(false?100:12.0);
        System.out.println(true?100:12.0);

    }
}

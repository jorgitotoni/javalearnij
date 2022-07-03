package net.addit.java.foundational.operator.arithmetic;

/**
 * 字符串拼接
 *
 * @author tony 241963698@qq.com
 * @version 2022/6/26 下午3:22
 * @since JDK8
 */
public class StringAppendOperator {
    public static void main(String[] args) {
        String str="";
        String appendResult=str+10;
        System.out.println("appendResult="+appendResult);
        str="拼接结果是：";
        appendResult=str+10;
        System.out.println(appendResult);

    }
}

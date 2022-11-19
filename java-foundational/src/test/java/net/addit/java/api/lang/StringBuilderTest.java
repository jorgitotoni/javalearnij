package net.addit.java.api.lang;

import org.testng.annotations.Test;

/**
 * StringBuiler类常用方法的测试用例
 *
 * @author tony 241963698@qq.com
 * @version 2022/8/15 下午12:33
 * @since JDK11
 */
public class StringBuilderTest {

    /**
     * StringBuilder对象创建的两种方式
     */
    @Test
    public void testStringBuilderConstructor(){
        StringBuilder empty=new StringBuilder();
        System.out.println("empty.length()="+empty.length());

        StringBuilder str=new StringBuilder("");
        System.out.println("str.length()="+str.length());

    }

    /**
     * append方法实现字符串拼接
     */
    @Test
    public void testStringBuilderAppend(){
        StringBuilder builder=new StringBuilder();
        StringBuilder one=builder.append("跟我学java");
        System.out.println(builder);
        System.out.println("builder.length()="+builder.length());
        StringBuilder two=builder.append("，跟我学习go").append("，跟我学习Python");
        System.out.println(builder);

        System.out.println("one==two"+(one==two));

        System.out.println("one.equals(two)"+one.equals(two));
        System.out.println(one);
        System.out.println(two);

    }

    /**
     * reverse方法实现字符串反转
     */
    @Test
    public void testStringBuilderReverse(){

        String str="Java";
        StringBuilder builder=new StringBuilder(str);
        System.out.println("反转之前的字符串内容："+str);
        System.out.println("反转之后的字符串内容："+builder.reverse());

    }

    /**
     * insert()方法实现字符串插入
     */
    @Test
    public void testStringBuilderInsert(){

        String str="跟学Java";
        StringBuilder builder=new StringBuilder(str);
        System.out.println("插入之前的字符串内容："+str);
        System.out.println("插入之后的字符串内容："+builder.insert(1,"我"));

    }

    /**
     * StringBuilder与String相互转换
     */
    @Test
    public void testStringBuilder2String(){

        String str="法拉利拉法";
        StringBuilder builder=new StringBuilder(str);
        String toStringResult=builder.toString();
        System.out.println(toStringResult);

    }
}

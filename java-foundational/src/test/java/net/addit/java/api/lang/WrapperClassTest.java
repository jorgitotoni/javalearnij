package net.addit.java.api.lang;

import org.testng.annotations.Test;

/**
 * 包装类常用方法的测试用例
 *
 * @author tony 241963698@qq.com
 * @version 2022/8/2 下午1:39
 * @since JDK11
 */
public class WrapperClassTest {

    /**
     * 字符串转换成整数的方法
     */
    @Test
    public void testIntegerParseInt(){
        String str="100";
        int value = Integer.parseInt(str);
        System.out.println("value="+value);
    }

    /**
     * int转换成Integer
     */
    @Test
    public void testIntegerValueOf(){
        int value=100;
        Integer integer = Integer.valueOf(value);
        System.out.println("Integer="+integer);
    }

    /**
     * integer的缓存
     * ==表示地址是否相同，equals()表示数值是否相同
     * integer缓存范围-128--127
     */
    @Test
    public void testIntegerCache(){
        int value=127;
        Integer source=Integer.valueOf(value);
        Integer target = Integer.valueOf(value);
        //true
        System.out.println("source==target:"+(source==target));

        value=128;
        source=Integer.valueOf(value);
        target = Integer.valueOf(value);
        //false
        System.out.println("source==target:"+(source==target));
        System.out.println("source.equals(target):"+(source.equals(target)));
    }

    /**
     * 自动拆箱和自动装箱
     */
    @Test
    public void testAutoBox(){
        int number=10;
        Integer value=Integer.valueOf(100);

        //自动拆箱
        number=value;
        System.out.println("自动拆箱的结果="+number);
        //自动装箱
        value=number;
        System.out.println("自动装箱的结果="+value);
    }

    /**
     * 大小写转换
     */
    @Test
    public void testCharacterUpperLower(){
        char ch='A';
        char lower = Character.toLowerCase(ch);
        System.out.println("大写字母A转换成小写："+lower);

        char upper = Character.toUpperCase(ch);
        System.out.println("小写字母a转换成大写："+upper);
    }

    /**
     * 大小写字母的判断
     */
    @Test
    public void testCharacterIsUpperLower(){
        char ch='A';
        System.out.println("A是否是大写字母"+Character.isUpperCase(ch));
    }

    /**
     * 获取字符数组中指定索引字符的Unicode编码
     */
    @Test
    public void testCharacterUnicode(){
        char[] chs={'a'};
        int index=0;
        int unicode=Character.codePointAt(chs,index);
        System.out.println("字符a对应的unicode编码值是"+unicode);
    }
}

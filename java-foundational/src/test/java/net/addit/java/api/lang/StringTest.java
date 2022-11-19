package net.addit.java.api.lang;

import org.testng.annotations.Test;

import java.util.Locale;

/**
 * 字符串构造方法和常用方法的测试用例
 *
 * @author tony 241963698@qq.com
 * @version 2022/8/3 下午1:29
 * @since JDK11
 */
public class StringTest {

    @Test
    public void testStringInstance(){
        String str1="abc";
        System.out.println(str1);

        String str2=new String("");
        System.out.println("hello"+str2+"world");

        char[] chars={'a','b','c','d'};
        String str3=new String(chars);
        System.out.println(str3);

        byte[] bytes={65,66,67};
        String str4=new String(bytes);
        System.out.println(str4);

        //在常量区
        String left="helloworld";
        String right="helloworld";
        System.out.println("left==right:"+(left==right));
        System.out.println("left.equals(right):"+left.equals(right));

        //在堆区
        String stra=new String("helloworld");
        String strb=new String("helloworld");
        System.out.println("stra==strb:"+(stra==strb));
        System.out.println("stra的哈希值："+stra.hashCode());
        System.out.println("strb的哈希值："+strb.hashCode());
        System.out.println("left.equals(right):"+stra.equals(strb));


    }

    @Test
    public void testStringLength(){
        String str="java学习";
        System.out.println(str+"的字符串长度是"+str.length());
    }

    @Test
    public void testStringConcat(){
        String str="跟我学";
        String desc = str.concat("java");
        System.out.println(str+"拼接java之后的结果是"+desc);

        //concat方法等价于+
        String str2="跟我学";
        str2+="java";
        System.out.println("str2="+str2);
    }

    @Test
    public void testStringCharAt(){
        String str="跟我学java";
        System.out.println(str+"的第一个字符是"+str.charAt(0));
        System.out.println(str+"的最后一个字符是"+str.charAt(str.length()-1));

    }

    /**
     * 测试字符串反转
     */
    @Test
    public void testStringReverse(){
        String str="abcdefg";
        String desc=reverse(str);
        System.out.printf("你输入的字符串是%s，反转后的字符串是%s",str,desc);

    }

    /**
     * 反转字符串的方法
     * @param str 原字符串
     * @return 反转后的字符串
     */
    public String reverse(String str){
        //String newStr=new String("");
        String newStr="";

        for (int i = str.length()-1; i >=0; i--) {
            char ch=str.charAt(i);
            newStr+=ch;
        }
        return newStr;
    }

    /**
     * 测试数组转字符串
     */
    @Test
    public void testArrayToString(){
        int[] numbers=new int[]{1,2,3,4,5};
        System.out.println(arrayToString(numbers));
    }


    /**
     * 将数组转换为字符串
     * @see java.util.Arrays#toString(int[]) 
     * @param array
     * @return
     */
    public String arrayToString(int[] array){
        String str="[";
        if(array.length==0){
            return "[]";
        }
        for (int i = 0; i < array.length; i++) {
            if(i<array.length-1){
                //不是最后的数字就拼接数字和逗号
                str+=array[i]+",";
            }else if(i==array.length-1){
                //如果是最后一个数字就拼接数字和]
                str+=array[i]+"]";
            }
        }
        return str;
    }

    /**
     * indexOf方法查找子串在父字符串第一次出现的索引
     */
    @Test
    public void testStringIndexOf(){
        String str="跟我学java";
        int index=str.indexOf("java");
        System.out.println("java在"+str+"第一次出现的索引是"+index);

        index=str.indexOf("Java");
        System.out.println("Java在"+str+"第一次出现的索引是"+index);

        String findstr="a";
        int firstIndex=str.indexOf(findstr);
        System.out.println(findstr+"在"+str+"第一次出现的索引是"+firstIndex);
        int secondIndex=str.indexOf(findstr,firstIndex+1);
        System.out.println(findstr+"在"+str+"第二次出现的索引是"+secondIndex);

        int lastIndex = str.lastIndexOf("a");
        System.out.println(findstr+"在"+str+"最后一次出现的索引是"+lastIndex);

    }

    /**
     * 字符串截取
     */
    @Test
    public void testStringSubString(){
        String str="跟我学java";
        String subResult=str.substring(4);
        System.out.println(str+"从4号索引截取的结果是"+subResult);

        subResult=str.substring(0,3);
        System.out.println(str+"从0号索引到3号索引截取的结果是"+subResult);


    }

    /**
     * 忽略大小写比对字符串
     */
    @Test
    public void testStringEqualsIgnoreCase(){
        String str1="跟我学java";
        String str2="跟我学Java";
        System.out.println("str1.equals(str2)"+str1.equals(str2));
        System.out.println("str1.equalsIgnoreCase(str2)"+str1.equalsIgnoreCase(str2));

    }

    /**
     * 判断字符串是否为空，是否只有空格
     */
    @Test
    public void testStringIsEmptyIsBlank(){
        String str1="";
        String str2=null;
        //true
        System.out.println("str1.isEmpty()="+str1.isEmpty());
        //NullPointerExcelption
        //System.out.println("str2.isEmpty()="+str2.isEmpty());
        String str3="    ";
        System.out.println("str3.isEmpty()="+str3.isEmpty());
        System.out.println("str3.isBlank()="+str3.isBlank());

    }

    /**
     * 判断字符串是否包含子串，将子串替换为新字符串
     */
    @Test
    public void testStringContainsReplace(){
        String str1="跟我学java";
        String str2="java";
        System.out.println("str1.contains(str2)="+str1.contains(str2));

        String message="我的密码是：666666";
        System.out.println("替换之前的内容是:"+message);

        if(message.contains("密码")){
            String replaceResult=message.replace("6","*");
            System.out.println("替换之后的内容是:"+replaceResult);
        }
    }

    /**
     * 判断字符串开头和结尾内容
     */
    @Test
    public void testStringStartWithEndsWith(){
        String filename="StringTest.java";
        String prefix="String";
        String suffix="java";
        boolean startsWith = filename.startsWith(prefix);
        System.out.println(filename+"是否以"+prefix+"开头："+startsWith);
        System.out.println(filename+"是否以"+suffix+"结尾："+filename.endsWith(suffix));

    }

    /**
     * 字符串中字母大小写转换
     */
    @Test
    public void testStringToUpperCaseToLowerCase(){
        String str="Java,Python,Go";
        String lowerCase = str.toLowerCase();
        String upperCase = str.toUpperCase();
        System.out.println(str+"lowerCase="+lowerCase);
        System.out.println(str+"upperCase="+upperCase);
    }

    /**
     *
     */
    @Test
    public void testToCharArrayGetBytes(){
        String str="helloworld";
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]+" ");
        }
        System.out.println("");
        //增强for循环 chars.for
        for (char ch : chars) {
            System.out.print(ch+" ");
        }
        System.out.println("");

        byte[] bytes = str.getBytes();
        for (byte aByte : bytes) {
            System.out.print(aByte+" ");
        }
    }

    /**
     * trim（）方法 去除空格,Split(String regex)方法分割字符串
     */
    @Test
    public void testStringTrimSplit(){
        String str=" Hello World ";
        System.out.println("去除空格前字符串内容："+str);
        String trimResult = str.trim();
        System.out.println("去除空格后字符串内容："+trimResult);

        String str1="java,go,python";
        String[] splitResult = str1.split(",");
        String[] split = str.split(" ");
        System.out.println("切割之后的字符串数组：");
        for (String s : split) {
            System.out.print(s+" ");
        }
        System.out.println("切割之后的字符串数组：");
        for (String s : splitResult) {
            System.out.print(s+" ");
        }
        String str2="java.go.python";
        System.out.println("切割之后的字符串数组：");
        String[] split1 = str2.split("\\.");
        for (String s : split1) {
            System.out.print(s+" ");

        }


    }
}

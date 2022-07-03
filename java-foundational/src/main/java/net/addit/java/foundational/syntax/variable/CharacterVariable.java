package net.addit.java.foundational.syntax.variable;

/**
 * 字符型变量的定义和使用
 *
 * @author tony 241963698@qq.com
 * @version 2022/6/25 下午2:20
 * @since JDK8
 */
public class CharacterVariable {
    public static void main(String[] args) {
        char ch='a';
        System.out.println(ch);
        //小写字符a对应的Unicode编码就是97
        //大写字符a对应的Unicode编码就是97
        //字符0（阿拉伯数字零）对应的Unicode编码就是48
        ch=97;
        System.out.println(ch);

        ch=65;
        System.out.println(ch);
        ch=48;
        System.out.println(ch);

        char zero='\u0030';
        System.out.println(zero);

        //转义字符
        char newline='\n';
        System.out.println("hello"+newline+"world");

        char path='\\';
        System.out.println(path);

        char tab='\t';
        System.out.println("hello"+tab+"world");
    }
}

package net.addit.java.foundational.syntax.variable;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * 整数的四种进制表示方式
 *
 * @author tony 241963698@qq.com
 * @version 2022/6/25 下午2:06
 * @since JDK8
 */
public class IntegerRadix {
    public static void main(String[] args) {
        int bin=0b1001;
        int oct=017;
        int dec=100;
        int hex=0x64;

        System.out.println(bin);
        System.out.println(oct);
        System.out.println(dec);
        System.out.println(hex);
    }
}

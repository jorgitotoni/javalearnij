package net.addit.java.api.lang;

import net.addit.java.foundational.oop.Cellphone;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * 异常机制
 *
 * @author tony 241963698@qq.com
 * @version 2022/10/7 上午11:31
 * @since JDK11
 */
public class ExceptionTest {

    /**
     * 算数异常
     */
    @Test
    public void testCreateArithmeticException(){
        System.out.println("程序开始执行");
        //0不能做除数，此处会引发ArithmeticException
        System.out.println(1/0);
        //由于没有处理ArithmeticException，JVM终止程序的运行，该语句不会执行
        System.out.println("程序结束运行");
    }

    /**
     * 抛出异常
     */
    @Test
    public void testThrowRuntimeException(){
        Cellphone cellphone=new Cellphone();
        cellphone.setPrice(-100);
        cellphone.setModel("iphone13");
    }

    /**
     * 声明式处理异常:throws关键字
     * 处理ParseException
     */
    @Test
    public void throwsParseException() throws ParseException {
        throw new ParseException("解析异常",6);

    }

    /**
     * 声明式处理异常示例
     */
    @Test
    public void testThrowsParseException() throws ParseException {
        throwsParseException();
        System.out.println("结束程序。。。");
    }

    /**
     * 捕获处理异常示例
     */
    @Test
    public void testTryCatchException(){
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        try {
            System.out.println("begin try...");
            dateFormat.parse("2022年10月6日");
            System.out.println("end try...");
        } catch (ParseException e) {
            System.out.println("程序发生了错误");;
        }
        //捕获处理异常，即使遇到了异常，catch后的代码依然会运行
        System.out.println("程序正常结束");
    }

    /**
     * 抛出多个异常
     * 抛出2个运行时异常并捕获
     * @param flag
     */
    public void throwMultiRuntimeException(int flag){
        try {
            if(flag==1){
                throw new NullPointerException("空指针异常");
            }else if(flag==2){
                throw new IllegalArgumentException("参数非法");
            }
            //java7后允许一个catch捕获多个异常，前提是多个异常类型平级，有共同父类
        } catch (NullPointerException|IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    /**
     * 捕获处理抛出的多个异常
     */
    @Test
    public void testInvokeThrowMultiRuntimeException(){
        throwMultiRuntimeException(1);
        throwMultiRuntimeException(2);
    }

    /**
     * try/catch/finally的使用
     */
    @Test
    public void testTryCatchFinally(){
        Scanner input=null;

        try{
            input=new Scanner(System.in);
            System.out.println(1/0);
            //关闭资源
            input.close();
            System.out.println("在try块关闭Scanner");
        }catch (Exception ex){
            System.out.println("系统发生了异常");
            return;
        }finally {
            input.close();
            System.out.println("在finally块关闭Scanner");
        }
        System.out.println("程序正常结束。。。");
    }

    /**
     * 方法重写的异常注意事项
     */
    @Test
    public void testGetFileInfo(){
        Father father=new Child();
        try {
            father.getFileInfo();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Father{
    /**
     * 获取文件信息
     * @throws IOException
     */
    public void getFileInfo() throws IOException {

    }

    public void noException(){

    }
}

class Child extends Father{
    @Override
    public void getFileInfo() throws FileNotFoundException {

    }

    //父类方法未声明异常，子类不可声明异常：
    //public void noException() throws RuntimeException
    @Override
    public void noException() {
        try {
            throw new RuntimeException("遇到异常");
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}

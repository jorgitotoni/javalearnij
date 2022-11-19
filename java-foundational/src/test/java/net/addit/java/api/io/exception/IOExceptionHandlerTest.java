package net.addit.java.api.io.exception;

import org.testng.annotations.Test;

import java.io.*;

/**
 * IO异常处理
 *
 * @author tony 241963698@qq.com
 * @version 2022/11/14 下午12:20
 * @since JDK11
 */
public class IOExceptionHandlerTest {

    /**
     * Java7以前的IO异常处理
     * @throws IOException
     */
    @Test
    public void testJava7BeforeIOExceptionHandler() throws IOException{
        Reader reader=null;
        Writer writer=null;
        //准备复制的源文件
        File sourceFile=new File("/Users/antoniojiang/Downloads/javaIo/data.txt");
        //准备复制的目标文件名
        String targetPath=new String("/Users/antoniojiang/Downloads/javaIo/dataCopy.txt");
        try {
            //字符输入流
            reader=new FileReader(sourceFile);
            //字符输出流
            writer=new FileWriter(targetPath,false);
            //每次读取的字符内容
            char[] buffer=new char[8];
            //每次读取的字符内容的长度（字符的个数）
            int bufLen=0;
            //循环读取文件内容，当返回值不是-1的时候将读取的值赋值给buffer
            while ((bufLen=reader.read(buffer))!=-1){
                writer.write(buffer,0,bufLen);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭字符输出流
            try {
                if(null!=writer){
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }finally{
                //关闭字符输入流
                try {
                    if(null!=reader){
                        reader.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    /**
     * Java7以后的IO异常处理：try-with-resources格式
     * @throws IOException
     */
    @Test
    public void testJava7AfterIOExceptionHandler() throws IOException{
        //准备复制的源文件
        File sourceFile=new File("/Users/antoniojiang/Downloads/javaIo/data.txt");
        //准备复制的目标文件名
        String targetPath=new String("/Users/antoniojiang/Downloads/javaIo/dataCopy.txt");
        try (
                //类必须实现AutoCloseable接口才能使用try-with-resources格式语句
                //字符输入流
                Reader reader=new FileReader(sourceFile);
                //字符输出流
                Writer writer=new FileWriter(targetPath,false);
                ){
            //每次读取的字符内容
            char[] buffer=new char[8];
            //每次读取的字符内容的长度（字符的个数）
            int bufLen=0;
            //循环读取文件内容，当返回值不是-1的时候将读取的值赋值给buffer
            while ((bufLen=reader.read(buffer))!=-1){
                writer.write(buffer,0,bufLen);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

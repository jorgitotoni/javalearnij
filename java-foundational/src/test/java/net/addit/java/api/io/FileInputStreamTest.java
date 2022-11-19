package net.addit.java.api.io;

import org.testng.annotations.Test;

import java.io.*;

/**
 * FileInputStream类字节输入流
 *
 * @author tony 241963698@qq.com
 * @version 2022/11/10 上午11:45
 * @since JDK11
 */
public class FileInputStreamTest{

    /**
     * FileInputStream创建对象 如果指定目录的文件不存在，会引发FileNotFoundException
     * @throws IOException
     */
    @Test
    public void testFileInputStream() throws IOException {
        File file=new File("/Users/antoniojiang/Downloads/javaIo/Test.txt");
//        FileOutputStream fileOutputStream=new FileOutputStream(file);
//        fileOutputStream.write("just a test\n".getBytes());
//        fileOutputStream.write("just another test\n".getBytes());
//        fileOutputStream.write("just last test\n".getBytes());
        FileInputStream fileInputStream=new FileInputStream(file);
        String path="/Users/antoniojiang/Downloads/javaIo/Test.txt";
        FileInputStream fileInputStream1=new FileInputStream(path);
    }

    /**
     * FileInputStream读取文件信息：一次读取一个字节
     * @throws IOException
     */
    @Test
    public void testFileInputStreamReadOneByte() throws IOException{
        File file=new File("/Users/antoniojiang/Downloads/javaIo/Test.txt");
        FileInputStream fileInputStream=new FileInputStream(file);

        //会漏字符
//        while(fileInputStream.read()!=-1){
//            char content = (char)fileInputStream.read();
//            System.out.println(content);
//        }

        int value=0;
        while((value=fileInputStream.read())!=-1){
            char content = (char)value;
            System.out.print(content);
        }
        fileInputStream.close();
    }

    /**
     * FileInputStream读取文件信息 一次读取多个字节
     * @throws IOException
     */
    @Test
    public void testFileInputStreamReadManyBytes() throws IOException{
        File file=new File("/Users/antoniojiang/Downloads/javaIo/Test.txt");
        FileInputStream fileInputStream=new FileInputStream(file);

        byte[] data=new byte[5];
        int byteLen=0;
        while((byteLen=fileInputStream.read(data))!=-1){
            String content=new String(data,0,byteLen);
            System.out.print(content);
        }

        fileInputStream.close();
    }

    /**
     * 使用字节输入流和字节输出流实现图片文件拷贝
     */
    @Test
    public void testImageCopy() throws IOException{
        String path="/Users/antoniojiang/Downloads/javaIo/笑脸素材.jpg";
        String target="/Users/antoniojiang/Downloads/javaIo/笑脸素材1.jpg";
        //1.创建字节输入流
        InputStream inputStream=new FileInputStream(path);
        //创建字节输出流
        OutputStream outputStream=new FileOutputStream(target);

        //每次读取1024字节长度储存到data数组中
        byte[] data=new byte[1024];
        //实际读取的字节长度
        int byteLen=0;
        //循环读取文件内容
        while ((byteLen=inputStream.read(data))!=-1){
            //将读取到的内容写入target文件
            outputStream.write(data,0,byteLen);
        }
        //关闭资源的时候，后打开的先关闭
        outputStream.close();
        inputStream.close();

    }
}

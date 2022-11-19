package net.addit.java.api.io;

import org.testng.annotations.Test;

import java.io.*;

/**
 * 字符输入流FileWriter的使用
 *
 * @author tony 241963698@qq.com
 * @version 2022/11/13 下午8:11
 * @since JDK11
 */
public class FileWriterTest {

    /**
     * 创建FileWriter的对象
     * 文件不存在时会自动创建，
     * append默认为false,文件存在时会将文件内容清空
     * 如果目录不存在，会引发FileNotFoundException
     * @throws IOException
     */
    @Test
    public void testFileWriterConstructorAppendFalse() throws IOException {
        File file=new File("/Users/antoniojiang/Downloads/javaIo/FileWriterTest.txt");
        Writer writer=new FileWriter(file);
        String path="/Users/antoniojiang/Downloads/javaIo/FileWriterTest.txt";
        writer=new FileWriter(path);

        writer.close();
    }

    /**
     * 创建FileWriter的对象
     * 文件不存在时会自动创建，
     * append改为true，文件存在时不会清空文件
     * 如果目录不存在，会引发FileNotFoundException
     * @throws IOException
     */
    @Test
    public void testFileWriterConstructorAppendTrue() throws IOException {
        File file=new File("/Users/antoniojiang/Downloads/javaIo/FileWriterTest.txt");
        Writer writer=new FileWriter(file,true);

        writer.close();
    }

    /**
     * 使用FileWriter往文件中写数据
     * @throws IOException
     */
    @Test
    public void testFileWriterWriteData() throws IOException{
        File file=new File("/Users/antoniojiang/Downloads/javaIo/FileWriterTest.txt");
        Writer writer=new FileWriter(file,false);
        //65对应的字符是A
        writer.write(65);
        writer.write(66);
        writer.write("跟我学Java");

        char[] chs=new char[]{'G','o','!'};
        writer.write(chs);

        char[] offsetChs=new char[]{'和','p','y','t','h','o','n','g'};
        writer.write(offsetChs,0,7);
        //关闭流后才会将缓冲区的数据写入文件
        writer.close();
    }

    /**
     * 使用FileReader和FileWriter实现文本文件拷贝
     * @throws IOException
     */
    @Test
    public void testTextFileCopy() throws IOException{
        //准备复制的源文件
        File sourceFile=new File("/Users/antoniojiang/Downloads/javaIo/data.txt");
        //字符输入流
        Reader reader=new FileReader(sourceFile);
        //准备复制的目标文件名
        String targetPath=new String("/Users/antoniojiang/Downloads/javaIo/dataCopy.txt");
        //字符输出流
        Writer writer=new FileWriter(targetPath,false);
        //每次读取的字符内容
        char[] buffer=new char[8];
        //每次读取的字符内容的长度（字符的个数）
        int bufLen=0;
        //循环读取文件内容，当返回值不是-1的时候将读取的值赋值给buffer
        while ((bufLen=reader.read(buffer))!=-1){
            writer.write(buffer,0,bufLen);
        }
        //关闭字符输出流
        writer.close();
        //关闭字符输入流
        reader.close();

    }
}

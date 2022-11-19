package net.addit.java.api.io;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * 字符输入流FileReader使用
 *
 * @author tony 241963698@qq.com
 * @version 2022/11/11 下午1:05
 * @since JDK11
 */
public class FileReaderTest {
    /**
     * 创建FileReader的两种方式：如果文件不存在会抛出FileNotFoundException
     * @throws IOException
     */
    @Test
    public void testFileReaderConstructor() throws IOException{
        File file=new File("/Users/antoniojiang/Downloads/javaIo/Test.txt");
        Reader reader=new FileReader(file);
        String path="/Users/antoniojiang/Downloads/javaIo/Test.txt";
        reader=new FileReader(path);
    }

    /**
     * 使用FileReader以字符为单位读取文件，一次读取一个字符
     * @throws IOException
     */
    @Test
    public void testFileReaderReadOneChar() throws IOException{
        File file=new File("/Users/antoniojiang/Downloads/javaIo/Test.txt");
        Reader reader=new FileReader(file);
        int value=0;
        //循环读取文件内容，当返回值不是-1的时候将读取的值赋值给value
        while ((value=reader.read())!=-1){
            char ch=(char)value;
            System.out.print(ch);
        }
        reader.close();
    }

    /**
     * 使用FileReader以字符为单位读取文件，一次读取多个字符
     * @throws IOException
     */
    @Test
    public void testFileReaderReadManyChars() throws IOException{
        File file=new File("/Users/antoniojiang/Downloads/javaIo/Test.txt");
        Reader reader=new FileReader(file);
        char[] buffer=new char[8];
        int bufLen=0;
        //循环读取文件内容，当返回值不是-1的时候将读取的值赋值给buffer
        while ((bufLen=reader.read(buffer))!=-1){
            System.out.print(new String(buffer,0,bufLen));
        }
        reader.close();
    }
}

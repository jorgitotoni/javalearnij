package net.addit.java.api.io;

import net.addit.java.api.util.DateTimeUtils;
import org.testng.annotations.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 字符缓冲流的使用
 *
 * @author tony 241963698@qq.com
 * @version 2022/11/15 下午1:03
 * @since JDK11
 */
public class BufferedReaderBufferedWriterTest {

    /**
     * 使用Reader,Writer实现大文本文件的拷贝
     */
    @Test
    public void testTextFileCopy(){
        long startTime=System.currentTimeMillis();
        File sourceFile=new File("/Users/antoniojiang/Downloads/javaIo/data.txt");
        File targetFile=new File("/Users/antoniojiang/Downloads/javaIo/datacopy.txt");
        try(
                Reader reader=new FileReader(sourceFile);
                Writer writer=new FileWriter(targetFile);
                BufferedReader bufferedReader=new BufferedReader(reader);
                BufferedWriter bufferedWriter=new BufferedWriter(writer);

        ){
            char[] buffer=new char[8192];
            int bufLen=0;
            while ((bufLen=bufferedReader.read(buffer))!=-1){
                //write()每次都写bufLen个字节到磁盘
                bufferedWriter.write(buffer,0,bufLen);
                System.out.println("当前对象文件大小为"+targetFile.length()+"字节");
            }
            long endTime=System.currentTimeMillis();
            long time = DateTimeUtils.calculatorTime(startTime, endTime);
            System.out.println("使用带缓冲的字符流拷贝文件(一次读写8192字节)耗时："+time+"毫秒");
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    /**
     * BufferedWriter写数据：newLine()方法换行
     */
    @Test
    public void testBufferedWriterNewLine(){
        File targetFile=new File("/Users/antoniojiang/Downloads/javaIo/datacopy.txt");
        try(
                Writer writer=new FileWriter(targetFile);
                BufferedWriter bufferedWriter=new BufferedWriter(writer);
        ){
        bufferedWriter.write("6.学Java");
        bufferedWriter.newLine();
        bufferedWriter.write("1.学Go");
            bufferedWriter.newLine();
        bufferedWriter.write("2.学Python");
            bufferedWriter.newLine();
            bufferedWriter.write("5.学Python");
            bufferedWriter.newLine();
            bufferedWriter.write("3.学Python");
            bufferedWriter.newLine();
            bufferedWriter.write("4.学Python");
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    /**
     * BufferedReader读数据：readLine()方法读取整行
     */
    @Test
    public void testBufferedReaderReadLine(){
        File targetFile=new File("/Users/antoniojiang/Downloads/javaIo/datacopy.txt");

        try(
                Reader reader=new FileReader(targetFile);
                BufferedReader bufferedReader=new BufferedReader(reader);
        ){
        String content=null;
        while (null!=(content=bufferedReader.readLine())){
            System.out.println(content);
        }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    /**
     * 对文本文件内容排序：按每行第一字升序
     */
    @Test
    public void testFileContentSort(){
        File targetFile=new File("/Users/antoniojiang/Downloads/javaIo/datacopy.txt");

        try(
                Reader reader=new FileReader(targetFile);
                BufferedReader bufferedReader=new BufferedReader(reader);
                //一旦new了writer对象，会把targetFile清空
                //Writer writer=new FileWriter(targetFile);
                //BufferedWriter bufferedWriter=new BufferedWriter(writer);

        ){
            String content=null;
            List<String> list=new ArrayList<>();
            while (null!=(content=bufferedReader.readLine())){
                list.add(content);
            }

            Collections.sort(list);

            Writer writer=new FileWriter(targetFile);
            BufferedWriter bufferedWriter=new BufferedWriter(writer);
            for (String sortedContent : list) {
                bufferedWriter.write(sortedContent);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

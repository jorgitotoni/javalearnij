package net.addit.java.api.io;

import net.addit.java.api.util.DateTimeUtils;
import org.testng.annotations.Test;

import java.io.*;

/**
 * 字节缓冲流和字节流读写性能的对比
 *
 * @author tony 241963698@qq.com
 * @version 2022/11/15 上午11:39
 * @since JDK11
 */
public class BufferedInputStreamBufferedOutputStreamTest {
    /**
     * 使用InputStream,OutputStream实现视频的拷贝
     */
    @Test
    public void testVideoCopyWithInputStreamOutputStream(){
        long startTime=System.currentTimeMillis();
        File sourceFile=new File("/Users/antoniojiang/Downloads/javaIo/data.txt");
        File targetFile=new File("/Users/antoniojiang/Downloads/javaIo/datacopy.txt");
        try(
                InputStream inputStream=new FileInputStream(sourceFile);
                OutputStream outputStream=new FileOutputStream(targetFile);
        ){
            byte[] buffer=new byte[8192];
            int bufLen=0;
            while ((bufLen=inputStream.read(buffer))!=-1){
                //write()每次都写bufLen个字节到磁盘
                outputStream.write(buffer,0,bufLen);
                System.out.println("当前对象文件大小为"+targetFile.length()+"字节");
            }
            long endTime=System.currentTimeMillis();
            long time = DateTimeUtils.calculatorTime(startTime, endTime);
            System.out.println("使用不带缓冲的字节流拷贝文件(一次读写8192字节)耗时："+time+"毫秒");
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    /**
     * 使用BufferedInputStream,BufferedOutputStream实现视频的拷贝
     */
    @Test
    public void testVideoCopyWithBufferedInputStreamBufferedOutputStream(){
        long startTime=System.currentTimeMillis();
        File sourceFile=new File("/Users/antoniojiang/Downloads/javaIo/data.txt");
        File targetFile=new File("/Users/antoniojiang/Downloads/javaIo/datacopy.txt");
        try(
                InputStream inputStream=new FileInputStream(sourceFile);
                OutputStream outputStream=new FileOutputStream(targetFile);
                BufferedInputStream bufferedInputStream=new BufferedInputStream(inputStream);
                BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(outputStream);
        ){
            byte[] buffer=new byte[8192];
            int bufLen=0;
            while ((bufLen=bufferedInputStream.read(buffer))!=-1){
                //write()每次都写bufLen个字节到磁盘
                bufferedOutputStream.write(buffer,0,bufLen);
                System.out.println("当前对象文件大小为"+targetFile.length()+"字节");
            }
            long endTime=System.currentTimeMillis();
            long time = DateTimeUtils.calculatorTime(startTime, endTime);
            System.out.println("使用不带缓冲的字节流拷贝文件(一次读写8192字节)耗时："+time+"毫秒");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

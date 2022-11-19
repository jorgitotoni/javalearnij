package net.addit.java.api.io;

import org.testng.annotations.Test;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * 转换流的使用
 *
 * @author tony 241963698@qq.com
 * @version 2022/11/16 下午3:54
 * @since JDK11
 */
public class InputStreamReaderOutputStreamWriterTest {

    /**
     * 读取GBK编码文件会有乱码问题
     */
    @Test
    public void testReaderGBKFile(){
        try(
                Reader reader=new FileReader("/Users/antoniojiang/Downloads/javaIo/GBK.txt")

        ){
            char[] buffer=new char[1024];
            int bufLen=0;
            while ((bufLen=reader.read(buffer))!=-1){
                System.out.println(new String(buffer,0,bufLen));
            }

        }catch(IOException e){
            e.printStackTrace();
        }
    }

    /**
     * 使用InputStreamReader读取GBK文件
     */
    @Test
    public void testInputStreamReaderReadFileContent(){
        try(
                InputStream inputStream=new FileInputStream("/Users/antoniojiang/Downloads/javaIo/GBK.txt");
                InputStreamReader inputStreamReader=new InputStreamReader(inputStream, Charset.forName("gbk"));
                BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
        ){
            String content=null;
            while(null!=(content=bufferedReader.readLine())){
                System.out.println(content);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    /**
     * 使用OutputStreamWriter实现按照指定编码来写文件
     */
    @Test
    public void testOutputStreamWriterWriteUTF8File(){
        try(
                OutputStream outputStream=new FileOutputStream("/Users/antoniojiang/Downloads/javaIo/utf8.txt");
                OutputStreamWriter outputStreamWriter=new OutputStreamWriter(outputStream,"utf-8");
                BufferedWriter bufferedWriter=new BufferedWriter(outputStreamWriter);
        ){
        bufferedWriter.write("跟我学Java");
        bufferedWriter.newLine();
        bufferedWriter.write("跟我学Go");
            bufferedWriter.newLine();
            bufferedWriter.write("跟我学Python");
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    /**
     * 使用转换流实现字符编码转换
     */
    @Test
    public void testFileEncodingConvert(){
        try(
                InputStream inputStream=new FileInputStream("/Users/antoniojiang/Downloads/javaIo/GBK.txt");
                InputStreamReader inputStreamReader=new InputStreamReader(inputStream, Charset.forName("gbk"));
                BufferedReader bufferedReader=new BufferedReader(inputStreamReader);

        ){
            String content=null;
            List<String> list=new ArrayList<>();

            while(null!=(content=bufferedReader.readLine())){
                list.add(content);
            }
            OutputStream outputStream=new FileOutputStream("/Users/antoniojiang/Downloads/javaIo/GBK.txt");
            OutputStreamWriter outputStreamWriter=new OutputStreamWriter(outputStream,"utf-8");
            BufferedWriter bufferedWriter=new BufferedWriter(outputStreamWriter);
            for (String convertedEncodingContent : list) {
                bufferedWriter.write(convertedEncodingContent);
            }
            bufferedWriter.close();
            outputStreamWriter.close();
            outputStream.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}

package net.addit.java.api.io;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 字节输出流FileOutputStream的使用
 *
 * @author tony 241963698@qq.com
 * @version 2022/11/7 下午12:39
 * @since JDK11
 */
public class FileOutputStreamTest {

    /**
     * 创建FileOutputStream对象，
     * 文件不存在时会自动创建，
     * 文件存在时会将文件内容清空
     * 如果目录不存在，会引发FileNotFoundException
     * @throws IOException
     */
    @Test
    public void testFileOutputStreamConstructor() throws IOException {
        File file=new File("/Users/antoniojiang/Downloads/javaIo/FileOutputStreamTest.txt");
        OutputStream outputStream=new FileOutputStream(file);
        //String path="/Users/antoniojiang/Downloads/javaIo/FileOutputStreamTest.txt";
        //outputStream=new FileOutputStream(path);
    }

    /**
     * 使用FileOutputStream以字节为单位往指定文件写数据
     * @throws IOException
     */
    @Test
    public void testFileOutputStreamWriteData() throws IOException {
        File file=new File("/Users/antoniojiang/Downloads/javaIo/FileOutputStreamTest.txt");
        OutputStream outputStream=new FileOutputStream(file);
        //往FileOutputStreamTest文件里面写一个字节的数据
        //97对应的字符是a，65对应的字符是A
        outputStream.write(97);

        byte[] data={98,99,100,101,102,103};
        outputStream.write(data);

        //48对应的字符是0
        byte[] offSetData={48,49,50,51,52,53,54,55};
        outputStream.write(offSetData,0,5);

        int chinese='中';
        //打印'中'字对应的字节：20013
        System.out.println("'中'字对应的字节是："+chinese);
        //实际无法写出'中'字，因为只能写一个字节的编码，但是一个汉字需要3个字节表示
        outputStream.write(20013);

        //默认不换行
        //不同操作系统换行是不一样的：windows是\r\n ，linux和macOS等是\n
        String osName = System.getProperty("os.name");
        System.out.println(osName);
        if(osName.equals("Windows 10")){
            outputStream.write("学Java\r\n".getBytes());
            outputStream.write("学Python\r\n".getBytes());
            outputStream.write("学Linux\r\n".getBytes());
        }else {
            outputStream.write("学Java\n".getBytes());
            outputStream.write("学Python\n".getBytes());
            outputStream.write("学Linux\n".getBytes());
        }

        //操作完成后关闭资源
        outputStream.close();
    }

    /**
     * 使用FileOutputStream实现文件内容拼接
     * @throws IOException
     */
    @Test
    public void testFileOutputStreamWriteDataAppend() throws IOException{
        File file=new File("/Users/antoniojiang/Downloads/javaIo/FileOutputStreamTest.txt");
        OutputStream outputStream=new FileOutputStream(file,true);
        outputStream.write("学Go\n".getBytes());
        outputStream.write("学前端\n".getBytes());
        outputStream.close();
    }

}

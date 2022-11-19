package net.addit.java.api.io;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

/**
 * File类的使用
 *
 * @author tony 241963698@qq.com
 * @version 2022/11/3 下午12:30
 * @since JDK11
 */
public class FileTest {

    /**
     * File对象创建的三种方式
     */
    @Test
    public void testFileConstructor(){
        //以 /Users/antoniojiang 路径创建File对象
        //即使路径不存在也可以创建File对象
        File directory=new File("/Users/antoniojiang");
        System.out.println(directory);

        File parentFile=new File("/Users");
        String child="antoniojiang";
        File ioDirectory=new File(parentFile,child);
        System.out.println(ioDirectory);

        String parent="/";
        File ioPath=new File(parent,child);
        System.out.println(ioPath);

        File file=new File("/Users/antoniojiang/Downloads/coolorusedl.rar");
        System.out.println("file= "+file);

        String parentPath="/Users/antoniojiang/Downloads";
        String childFileName="coolorusedl.rar";
        File testTxt=new File(parentPath,childFileName);
        System.out.println("testText= "+testTxt);
    }

    /**
     * 文件夹的创建和删除
     */
    @Test
    public void testDirectoryCreateDelete(){
        File directory=new File("/Users/antoniojiang/Downloads/javaIo");
        directory.mkdir();

        File multiLevelDirectory=new File("/Users/antoniojiang/Downloads/javaIo/test/test");
        multiLevelDirectory.mkdirs();
        multiLevelDirectory.delete();

    }

    /**
     * 文件的创建和删除
     */
    @Test
    public void testFileCreateDelete() throws IOException {
        File file=new File("/Users/antoniojiang/Downloads/javaIo/test.txt");
        file.createNewFile();
        file.delete();

    }

    /**
     * 获取文件夹和文件的信息
     */
    @Test
    public void testGetDirectoryAndFilePath() throws IOException {
        File directory=new File("/Users/antoniojiang/Downloads/javaIo");
        System.out.println("当前File对象所表示的绝对路径："+directory.getAbsolutePath());
        System.out.println("当前File对象所表示的绝对路径："+directory.getAbsoluteFile());
        System.out.println("当前File对象所表示的名称："+directory.getName());
        System.out.println("当前File对象所表示的长度："+directory.length());

        File file=new File("/Users/antoniojiang/Downloads/javaIo/test.txt");
        file.createNewFile();
        System.out.println("当前File对象所表示的绝对路径："+file.getAbsolutePath());
        System.out.println("当前File对象所表示的绝对路径："+file.getAbsoluteFile());
        System.out.println("当前File对象所表示的名称："+file.getName());
        System.out.println("当前File对象所表示的长度："+file.length());
    }

    /**
     * 判断文件夹和文件
     */
    @Test
    public void testFileJudge(){
        File file=new File("/Users/antoniojiang/Downloads/javaIo/test.txt");
        boolean exits=file.exists();
        System.out.println("/Users/antoniojiang/Downloads/javaIo/test.txt是否存在:"+exits);
        boolean isFile = file.isFile();
        System.out.println("当前file是否是文件："+isFile);
        boolean isDirectory = file.isDirectory();
        System.out.println("当前file是否是目录："+isDirectory);
    }

    /**
     * 获取指定File对象的子目录或文件
     */
    @Test
    public void testFileList(){
        File inputStream=new File("/Users/antoniojiang/Downloads/javaIo/inputstream");
        File outputStream=new File("/Users/antoniojiang/Downloads/javaIo/outputstream");
        File reader=new File("/Users/antoniojiang/Downloads/javaIo/reader");
        File writer=new File("/Users/antoniojiang/Downloads/javaIo/writer");
        inputStream.mkdirs();
        outputStream.mkdirs();
        reader.mkdirs();
        writer.mkdirs();

        File io=new File("/Users/antoniojiang/Downloads/javaIo");
        //获取io目录下的一级子目录
        File[] files=io.listFiles();
        for (File file : files) {
            System.out.println(file);
        }

        File java=new File("/Users/antoniojiang/JavaProject/JavaLearn/javalearnij/java-foundational/src/test/java/net/addit/java/api/lang");
        System.out.println("获取结尾是.java的文件");
//        String[] javaFileList = java.list((file, name) -> {
//            return name.endsWith(".java");
//        });
//        for (String javeFile : javaFileList) {
//            System.out.println(javeFile);
//        }
        for (String javaFile : java.list((file, name) -> name.endsWith(".java"))) {
            System.out.println(javaFile);
        }
    }

    /**
     * 获取指定File对象的子目录或文件:File对象不存在时
     */
    @Test
    public void testFileListFilesWarning(){
        File ioDirectory=new File("/Users/antoniojiang/Downloads/Io");
        File[] files=ioDirectory.listFiles();
        if (null!=files) {
            for (File file : files) {
                System.out.println(file);
            }
        }
    }
}

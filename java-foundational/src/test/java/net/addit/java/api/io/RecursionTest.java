package net.addit.java.api.io;

import org.testng.annotations.Test;

import java.io.File;

/**
 * 递归的应用
 *
 * @author tony 241963698@qq.com
 * @version 2022/11/4 下午1:25
 * @since JDK11
 */
public class RecursionTest {

    static int count;
    File io=new File("/Users/antoniojiang/Downloads/javaIo/");

    /**
     * 不合理的递归会导致栈内存溢出
     * 递归的调用没有出口
     */
    public void recursionCall(){
        recursionCall();
    }

    /**
     * 避免栈内存溢出
     */
    public void recursionCallV2(){
        System.out.println("count="+count);
        count++;
//        recursionCallV2();
//        /**
//         * 打印出来的count为4882,但实际达不到
//         */
        if(count<3200){
            recursionCallV2();
        }
    }

    /**
     * 递归的调用
     */
    @Test
    public void testRecursionCall(){
//        recursionCall();
//        recursionCallV2();
        System.out.println("100的累加和: "+sum(100));
        System.out.println("8的阶乘: "+factorial(8));
        System.out.println(io.getAbsolutePath()+"文件夹内文件总大小为："+statisticsFileSize(io.getAbsolutePath()));
        System.out.println(io.getAbsolutePath()+"文件夹内,文件总数为："+countFile+" 文件夹总数为："+countDirectory);
    }

    /**
     * 递归：计算N的累加和
     * @param n
     * @return
     */
    public long sum(int n){
        if(n==0){
            return 0;
        }else{
            return n+sum(n-1);
        }
    }

    /**
     * 递归：计算N的阶乘
     * @param n
     * @return
     */
    public long factorial(int n){
        if(n==1){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }

    long totalFileSize=0;
    int countDirectory=0;
    int countFile=0;

    /**
     * 递归：统计指定目录（目录是多级的）的文件大小
     * @param path
     * @return
     */
    public long statisticsFileSize(String path){
        File currentDirectory=new File(path);
        File[] files = currentDirectory.listFiles();
        for (File file : files) {
            if(file.isFile()){
                countFile++;
                totalFileSize+=file.length();
            }else if(file.isDirectory()){
                countDirectory++;
                statisticsFileSize(file.getAbsolutePath());
            }
        }
        return totalFileSize;
    }

    /**
     * 递归：删除非空文件夹
     * @param path
     */
    public void deleteFolder(String path){
        File file=new File(path);
        if(file.isFile()){
            System.out.println("文件"+file.getName()+"已经被删除");
            file.delete();
            return;
        }
        /****************删除多级子目录中的文件和文件夹开始********************/
        File[] files = file.listFiles();
        if(null!=files){
            for (File currentFile : files) {
                if(currentFile.isFile()){
                    System.out.println("文件"+currentFile.getName()+"已经被删除");
                    currentFile.delete();
                }else if(currentFile.isDirectory()){
                    deleteFolder(currentFile.getAbsolutePath());
                    System.out.println("文件夹"+currentFile.getName()+"已经被删除");
                    currentFile.delete();
                }
            }
        }
        /****************删除多级子目录中的文件和文件夹结束********************/
        if(file.isDirectory()){
            System.out.println("文件夹"+file.getName()+"已经被删除");
            file.delete();
        }
    }
}

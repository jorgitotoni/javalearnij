package net.addit.java.api.lang;

import org.testng.annotations.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Properties;

/**
 * System类常用方法的测试用例
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/31 下午2:47
 * @since JDK11
 */
public class SystemTest {

    @Test
    public void testCurrentTimeMillis(){
        long startTime=System.currentTimeMillis();
        //程序睡2秒
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime=System.currentTimeMillis();
        long time=endTime-startTime;
        System.out.println("耗时："+time+"毫秒");
    }

    /**
     * 获取所有系统环境变量信息
     */
    @Test
    public void testSystemGetEnv(){
        Map<String, String> env = System.getenv();
        //增强for循环遍历map
        for(String name:env.keySet()){
            System.out.println(name+"---->"+env.get(name));
        }
    }

    /**
     * 获取指定系统环境变量信息
     */
    @Test
    public void testSystemGetEnvByName(){
        System.out.println(System.getenv("JAVA_HOME"));
        System.out.println(System.getenv("MAVEN_HOME"));

    }

    /**
     * 获取系统属性
     */
    @Test
    public void testSystemProperties(){
        Properties properties = System.getProperties();
        try {
            properties.store(new FileOutputStream("system_properties.txt"),"MacOs system properties");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取指定系统属性
     */
    @Test
    public void testSystemGetProperty(){
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("line.separator"));
        System.out.println(System.getProperty("file.encoding"));
        System.out.println(System.getProperty("java.version"));
    }

    /**
     * 退出java虚拟机
     */
    @Test
    public void testSystemExit(){
        //0正常退出JVM，非0异常退出JVM
        System.exit(0);
        System.out.println("haha");
    }

    /**
     * 数组复制
     */
    @Test
    public void testSystemArrayCopy(){
        int[] src={1,2,3,4,5,6,7,8,9};
        int[] dest={100,200,300,400,500,600,700,800,900};
        System.arraycopy(src,2,dest,2,3);
        System.out.println("原数组内容"+ Arrays.toString(src));
        System.out.println("原数组内容"+ Arrays.toString(dest));
    }
}

package net.addit.java.api.io;

import org.testng.annotations.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.util.Set;

/**
 * Properties类的使用
 *
 * @author tony 241963698@qq.com
 * @version 2022/11/14 下午12:45
 * @since JDK11
 */
public class PropertiesTest {
    /**
     * Properties读取文件
     */
    @Test
    public void testPropertiesReadFile(){

        try(
            //从类路径加载application.properties
            InputStream inputStream=PropertiesTest.class.getClassLoader().getResourceAsStream("application.properties")
        ){
            Properties properties=new Properties();
            properties.load(inputStream);
            Set<String> propertyNames = properties.stringPropertyNames();
            for (String propertyName : propertyNames) {
                Object propertyValue = properties.get(propertyName);
                System.out.println("属性名："+propertyName+"属性值："+propertyValue);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    /**
     * Properties写文件
     */
    @Test
    public void testPropertiesWriteData(){
        String path="/Users/antoniojiang/JavaProject/JavaLearn/javalearnij/java-foundational/src/main/resources/user.properties";

        try(
            OutputStream outputStream=new FileOutputStream(path);
        ){
            Properties properties=new Properties();
            properties.setProperty("username","admin");
            properties.setProperty("password","111111");
            properties.store(outputStream,"后台管理系统默认的用户名，密码");
        }catch(IOException e){
            e.printStackTrace();
        }


    }
}

package net.addit.java.api.testng;

import org.testng.annotations.*;

/**
 * TestNG的使用测试用例
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/29 下午5:20
 * @since JDK11
 */
public class MyTest {

    @Test
    public void testTestAnnotation1(){
        System.out.println("执行TestTestAnnotation1方法");
    }

    @Test
    public void testTestAnnotation2(){
        System.out.println("执行TestTestAnnotation2方法");
    }

    @BeforeMethod
    public void testBeforeMethodAnnotation(){
        System.out.println("执行testBeforeMethodAnnotation方法");
    }

    @AfterMethod
    public void testAfterMethodAnnotation(){
        System.out.println("执行testAfterMethodAnnotation方法");
    }

    @BeforeClass
    public void testBeforeClassAnnotation(){
        System.out.println("执行testBeforeClassAnnotation方法");
    }

    @AfterClass
    public void testAfterClassAnnotation(){
        System.out.println("执行testAfterClassAnnotation方法");
    }
}

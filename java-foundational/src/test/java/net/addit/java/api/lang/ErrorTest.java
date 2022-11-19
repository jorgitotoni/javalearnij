package net.addit.java.api.lang;

import org.testng.annotations.Test;

/**
 * 错误的示例
 *
 * @author tony 241963698@qq.com
 * @version 2022/10/7 上午11:51
 * @since JDK11
 */
public class ErrorTest {

    /**
     * 方法递归调用会造成StackOverFlowError
     */
    public void createStackOverFlowError(){
        System.out.println("I'm StackOverFlowError");
        createStackOverFlowError();
    }

    /**
     * 栈溢出错误:StackOverFlowError
     */
    @Test
    public void testCreateStackOverFlowError(){
        createStackOverFlowError();
    }
}

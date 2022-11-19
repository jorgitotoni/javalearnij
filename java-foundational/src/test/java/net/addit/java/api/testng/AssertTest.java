package net.addit.java.api.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * 断言的测试用例
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/30 上午9:41
 * @since JDK11
 */
public class AssertTest {

    @Test
    public void testAssert(){
        Assert.assertEquals(1,10);
    }
}

package net.addit.java.api.util;

import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * 随机数工具类的测试用例
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/30 上午11:18
 * @since JDK11
 */
public class RandomUtilTest {

    /**
     * 生成10个4位随机验证码
     */
    @Test
    public void testVerificationCode(){
        for (int i = 0; i < 10; i++) {
            System.out.print(RandomUtil.verificationCode(4)+" ");
        }
    }

    /**
     * 生成10个8位数随机密码
     */
    @Test
    public void testRandomPassword(){
        for (int i = 0; i < 10; i++) {
            System.out.print(RandomUtil.randomPassword(8)+" ");
        }
    }

    /**
     * 红包总金额200，共10个红包
     */
    @Test
    public void testGrabRedEnvelope(){
        Double[] envelopes=RandomUtil.grabRedEnvelope(200.0,10);
        System.out.println("红包为："+ Arrays.toString(envelopes));
    }
}

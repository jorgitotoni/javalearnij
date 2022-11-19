package net.addit.java.api.util;

import org.testng.annotations.Test;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 随机数的测试用例
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/30 上午10:48
 * @since JDK11
 */
public class RandomTest {

    /**
     * 随机数Random
     */
    @Test
    public void testRandomDefaultConstructor(){
        //产生10个随机整数，数值范围就是int的取值范围
        Random random=new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt());
        }
    }

    /**
     * 产生指定范围的随机数
     */
    @Test
    public void testRandomBound(){
        //产生20个0-9之间的随机整数
        Random random=new Random();
        for (int i = 0; i < 20; i++) {
            System.out.print(random.nextInt(10)+" ");
        }
    }

    /**
     * 有种子数的随机数（只要种子相同，各种环境都能生成一样的随机序列）
     */
    @Test
    public void testRandomSeed(){
        Random random=new Random(88);
        for (int i = 0; i < 10; i++) {
            System.out.print(random.nextInt()+" ");
        }
        //在各种环境下都会生成这组数字：
        //-1177030515 -441328586 -1138069217 2008506121 -1829342380 134862877 1538110139 1980847304 1414505319 -785916362
    }

    /**
     * 测试ThreadLocalRandom
     */
    @Test
    public void testThreadLocalRandom(){
        ThreadLocalRandom threadLocalRandom=ThreadLocalRandom.current();
        for (int i = 0; i < 10; i++) {
            System.out.print(threadLocalRandom.nextDouble(100.0)+" ");
        }
    }
}

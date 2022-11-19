package net.addit.java.api.util;

/**
 * 自定义数组工具类
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/31 下午2:27
 * @since JDK11
 */
public class ArrayUtils {

    /**
     * 产生一个整数数组，数组的值是随机的，在int的取值范围内
     * @param length
     * @return
     */
    public static int[] generatorArray(int length){
        if(length<1){
            throw new RuntimeException("数组长度必须大于1");
        }
        return RandomUtil.randomArray(length);
    }

    public static int[] generatorArray(int length,int bound){
        if(length<1){
            throw new RuntimeException("数组长度必须大于1");
        }
        if(bound<1){
            throw new RuntimeException("取值范围必须大于1");
        }
        return RandomUtil.randomArray(length,bound);
    }
}

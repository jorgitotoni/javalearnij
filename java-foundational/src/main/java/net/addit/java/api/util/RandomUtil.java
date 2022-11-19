package net.addit.java.api.util;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 随机数的工具类
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/30 上午11:09
 * @since JDK11
 */
public class RandomUtil {

    /**
     * 特殊字符
     */
    private static final String SPECIAL_CHARS="!@#$%^&*";

    /**
     * 创建一个随机数对象
     * @return
     */
    private static Random random(){
        ThreadLocalRandom threadLocalRandom=ThreadLocalRandom.current();
        return threadLocalRandom;
    }

    /**
     * 随机生成4位或6位验证码
     * @param length 验证码长度，只能是4或6
     * @return
     */
    public static String verificationCode(int length){
        char[] chars=new char[length];
        if(length==4 || length==6){
            for (int i = 0; i < length; i++) {
                chars[i]=(char)('0'+random().nextInt(10));
            }
        }else{
            throw new RuntimeException("手机验证码位数不对");
        }
        return new String(chars);
    }


    /**
     * 生成一个随机字符（大写小写字母、数字、特殊字符）
     * @param random
     * @return
     */
    private static char nextChar(Random random){

        switch (random.nextInt(4)){
            case 0:
                return (char)('0'+random.nextInt(10));
            case 1:
                return (char)('A'+random.nextInt(26));
            case 2:
                return (char)('a'+random.nextInt(26));
            default:
                return SPECIAL_CHARS.charAt(random.nextInt(SPECIAL_CHARS.length()));
        }
    }

    /**
     * 随机生成任意长度的密码
     * @param length
     * @return
     */
    public static String randomPassword(int length){
        if(length<6){
            throw new RuntimeException("密码长度不能小于6");
        }
        char[] chars=new char[length];
        for (int i = 0; i < length; i++) {
            chars[i]=nextChar(random());
        }
        return new String(chars);
    }

    /**
     * 拼手气抢红包
     * @param total 总金额
     * @param number 红包个数
     * @return
     */
    public static Double[] grabRedEnvelope(double total,int number){
        Double[] envelopes=new Double[number];
        for (int i = 0; i < number-1; i++) {
            envelopes[i]=random().nextDouble()*total;
            total=total-envelopes[i];
        }
        envelopes[number-1]=total;
        return envelopes;
    }

    /**
     * 生成一个指定长度的数组，数组的元素是int类型的随机数
     * @param length
     * @return
     */
    public static int[] randomArray(int length){
        int[] numbers=new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i]=random().nextInt();
        }
        return numbers;
    }

    /**
     * 生成一个指定长度的数组，数组的元素是指定范围的随机数
     * @param length
     * @param bound
     * @return
     */
    public static int[] randomArray(int length,int bound){
        int[] numbers=new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i]=random().nextInt(bound);
        }
        return numbers;
    }
}

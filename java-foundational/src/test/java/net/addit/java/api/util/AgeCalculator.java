package net.addit.java.api.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.Scanner;

/**
 * 年龄计算器
 *
 * @author tony 241963698@qq.com
 * @version 2022/8/16 下午1:50
 * @since JDK11
 */
public class AgeCalculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入出生年月日（yyyyMMdd)");
        String source=input.next();

        Date birthday = DateTimeUtils.str2Date(source, "yyyyMMdd");
        Date currentDate=new Date();

        BigDecimal pastTime=new BigDecimal(currentDate.getTime()-birthday.getTime());
        long divisor=1000*60*60*24;
        BigDecimal days = pastTime.divide(BigDecimal.valueOf(divisor), 0, RoundingMode.HALF_UP);
        BigDecimal years= days.divide(BigDecimal.valueOf(365),1,RoundingMode.HALF_UP);
        System.out.println("出生距今"+days+"天，合"+years+"年。");

    }
}

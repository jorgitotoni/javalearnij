package net.addit.java.api.text;

import net.addit.java.api.util.DateTimeUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * SimpleDateFormat线程安全问题
 *
 * @author tony 241963698@qq.com
 * @version 2022/8/18 下午12:32
 * @since JDK11
 */
public class SimpleDateFormatNotThreadSafe {

    public static void main(String[] args) {
        DateFormat dateFormat=new SimpleDateFormat(DateTimeUtils.STANDARD_DATE_FORMAT);

        for (int i = 0; i < 30; i++) {
            Thread thread=new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Date parseDate=dateFormat.parse("2022-08-18 12:35:01");
                        System.out.println("将日期字符串转换为日期对象的结果："+parseDate);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
            });
            thread.start();
        }

    }

}

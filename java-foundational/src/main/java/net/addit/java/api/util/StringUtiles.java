package net.addit.java.api.util;

/**
 * 字符串工具类
 *
 * @author tony 241963698@qq.com
 * @version 2022/8/15 下午12:45
 * @since JDK11
 */
public class StringUtiles {
    /**
     * 字符串反转
     * @param str
     * @return
     */
    public static String reverse(String str){
        if(str==null){
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }

    public static String arrayToString(int[] array){
        if(null==array){
            return "null";
        }
        int maxIndex=array.length-1;
        if(maxIndex==-1){
            return "[]";
        }
        StringBuilder builder=new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            if(i!=maxIndex){
                builder.append(array[i]).append(",");
            }else{
                builder.append(array[i]).append("]");
            }
        }
        return builder.toString();
    }
}

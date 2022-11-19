package net.addit.java.api.util;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 * 字符串统计案例
 * 需求：用户输入一段字符串，要统计其中字符的个数
 *
 * @author tony 241963698@qq.com
 * @version 2022/10/4 下午8:09
 * @since JDK11
 */
public class MapStatisticsCharCount {

    public static void main(String[] args) {
        System.out.println("请输入一段字符串：");
        Scanner input=new Scanner(System.in);
        //读取用户输入的字符串，保存到text中
        String text=input.nextLine();
        //将字符串转换为字符数组
        char[] chars = text.toCharArray();
        //创建Map对象，存储统计的字符和对应的个数信息
        Map<Character,Integer> map=new TreeMap<>();
        //遍历字符数组，统计每个字符的个数
        for (char ch :chars){
            //用户输入了重复的字符
            if(map.containsKey(ch)){
                Integer chCount = map.get(ch);
                chCount++;
                map.put(ch,chCount);
            }else{
                map.put(ch,1);
            }
        }
        System.out.println("输入的内容为****************");
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            Character ch = entry.getKey();
            Integer count = entry.getValue();
            System.out.println("字符："+ch+"    个数："+count);
        }
    }
}

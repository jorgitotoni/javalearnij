package net.addit.java.foundational.oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 面向对象编程思想测试用例
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/11 下午1:12
 * @since JDK8
 */
public class OopTest {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3));
        System.out.println("初始化："+list);

        list.add(4);
        System.out.println("添加之后："+list);
    }
}

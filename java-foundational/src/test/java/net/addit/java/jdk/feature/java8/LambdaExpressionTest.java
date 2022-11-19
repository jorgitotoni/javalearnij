package net.addit.java.jdk.feature.java8;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Lambda表达式的使用
 *
 * @author tony 241963698@qq.com
 * @version 2022/10/31 下午1:14
 * @since JDK11
 */
public class LambdaExpressionTest {

    /**
     * 面向对象编程和函数式编程两种编程风格的对比
     */
    @Test
    public void testLambda(){
        //面向对象的方式创建和启动线程
        new Thread(new CustomRunnable()).start();

        //函数式编程的方式来创建和启动线程
        new Thread(()->{
            System.out.println("2.函数式编程的方式创建和启动线程");
        }).start();
    }

    /**
     * lambda表达式完整格式的使用
     */
    @Test
    public void testCollectionsSort(){
        List<Integer> list=new ArrayList<>();
        list.add(100);
        list.add(1949);
        list.add(2021);
        list.add(56);
        list.add(31);
        list.add(1921);
        //使用匿名内部类降序排序list集合
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer value1, Integer value2) {
                return value2-value1;
            }
        });
        System.out.println("使用匿名内部类降序排序list集合的结果"+list);

        //使用lambda表达式降序排序list集合
        Collections.sort(list,(Integer value1,Integer value2)->{
            return value2-value1;
        });
        System.out.println("使用lambda表达式降序排序list集合的结果"+list);

        //使用lambda表达式降序排序list集合
        Collections.sort(list,(value1,value2)->value2-value1);
        System.out.println("使用lambda表达式降序排序list集合的结果"+list);
    }

    /**
     * lambda表达式的应用场景
     */
    @Test
    public void testLambdaExpressionUsage(){
        //变量
        CustomFunctionalInterface customFunctionalInterface=(int left,int right)->{return left+right;};
        int result = customFunctionalInterface.add(100, 200);
        System.out.println("result= "+result);

        //方法的返回值
        CustomFunctionalInterface invokeResult=getCustomFunctionalInterface();
        result=invokeResult.add(1000,2000);
        System.out.println("result= "+result);
    }

    /**
     * lambda表达式可以作为方法的返回值
     * @return
     */
    public CustomFunctionalInterface getCustomFunctionalInterface(){
        return (int left,int right)->{return left+right;};
    }
}

class CustomRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("1.面向对象的方式创建和启动线程");
    }
}
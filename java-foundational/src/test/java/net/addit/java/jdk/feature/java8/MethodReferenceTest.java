package net.addit.java.jdk.feature.java8;

import net.addit.java.api.util.DateTimeUtils;
import net.addit.java.foundational.oop.Cellphone;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 方法引用的使用
 *
 * @author tony 241963698@qq.com
 * @version 2022/11/2 上午11:16
 * @since JDK11
 */
public class MethodReferenceTest {

    /**
     * 打印当前时间
     */
    static void printCurrentTime(){
        System.out.println(DateTimeUtils.getCurrentTime());
    }

    public static void main(String[] args) {
        new Thread(()->{
            System.out.println(DateTimeUtils.getCurrentTime());
        }).start();

        new Thread(()->{
            printCurrentTime();
        }).start();

        //使用类成员方法替换lambda表达式
        new Thread(MethodReferenceTest::printCurrentTime).start();
    }

    /**
     * 构造方法引用
     */
    @Test
    public void testConstructorMethodReference(){
        List<String> modelNameList=new ArrayList<>();
        modelNameList.add("小米11");
        modelNameList.add("iphone12");
        modelNameList.add("华为mate50");
        //将list集合元素的内容转换为Cellphone对象
        //使用StreamAPI结合lambda表达式实现
        System.out.println("使用StreamAPI结合lambda表达式实现");
        List<Cellphone> cellphoneList = modelNameList.stream().map((modelName) -> {
            return new Cellphone(modelName);
        }).collect(Collectors.toList());
        for (Cellphone cellphone : cellphoneList) {
            System.out.println(cellphone);
        }

        //使用StreamAPI结合构造方法引用实现
        System.out.println("使用StreamAPI结合构造方法引用实现");
        List<Cellphone> constructorMethodCellphoneList = modelNameList.stream().map(Cellphone::new).collect(Collectors.toList());
        for (Cellphone cellphone : constructorMethodCellphoneList) {
            System.out.println(cellphone);
        }
    }

    /**
     * 静态方法引用
     */
    @Test
    public void testStaticMethodReference(){
        List<String> orderStrIdList=new ArrayList<>();
        orderStrIdList.add("1000");
        orderStrIdList.add("1001");
        orderStrIdList.add("1002");
        //将订单号转换为整数的
        List<Integer> orderIdList=new ArrayList<>();
        orderStrIdList.stream().map((orderStrId) -> {
            return Integer.parseInt(orderStrId);
        }).forEach((orderId)->{
            orderIdList.add(orderId);
        });
        System.out.println("使用StreamAPI结合lambda表达式实现");
        for (Integer orderId : orderIdList) {
            System.out.println(orderId);
        }
        System.out.println("使用StreamAPI结合静态方法引用实现");
        List<Integer> staticMethodOrderIdList=new ArrayList<>();
        orderStrIdList.stream().map(Integer::parseInt).forEach((orderId)->{
            staticMethodOrderIdList.add(orderId);
        });
        for (Integer orderId : staticMethodOrderIdList) {
            System.out.println(orderId);
        }
    }

    /**
     * 成员方法引用
     * 对象成员方法
     */
    @Test
    public void testObjectMemberMethodReference(){
        List<String> modelNameList=new ArrayList<>();
        modelNameList.add("小米11");
        modelNameList.add("iphone12");
        modelNameList.add("华为mate50");
        //集合元素遍历输出
        System.out.println("使用StreamAPI结合lambda表达式实现");
        modelNameList.stream().forEach((modelName)->{
            System.out.println(modelName);
        });
        System.out.println("使用StreamAPI结合对象方法引用实现");
        modelNameList.stream().forEach(System.out::println);

    }

    /**
     * 成员方法引用
     * 类成员方法
     */
    @Test
    public void testClassMemberMethodReference(){
        List<String> modelNameList=new ArrayList<>();
        modelNameList.add("小米11");
        modelNameList.add("iphone12");
        modelNameList.add("华为mate50");
        //将集合中的字符串转换为对应的长度后遍历输出
        System.out.println("使用StreamAPI结合lambda表达式实现");
        modelNameList.stream().map((modelName)->{
            return modelName.length();
        }).forEach(System.out::println);
        System.out.println("使用StreamAPI结合类方法引用实现");
        modelNameList.stream().map(String::length).forEach(System.out::println);

    }
}

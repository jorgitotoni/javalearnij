package net.addit.java.jdk.feature.java8;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * StreamAPI的使用
 *
 * @author tony 241963698@qq.com
 * @version 2022/11/1 上午10:01
 * @since JDK11
 */
public class StreamAPITest {

    List<String> list;

    @BeforeClass
    public void initList(){
        list=new ArrayList<>();
        list.add("孙悟空");
        list.add("猪八戒");
        list.add("沙和尚");
        list.add("唐僧");
        list.add("刘备");
        list.add("刘邦");
        System.out.println("初始化list集合元素为："+list);
    }
    /**
     * 使用传统方式操作集合
     * 1.创建新集合
     * 2.遍历
     */
    @Test
    public void testListOperator(){

        //需求：获取名字长度为3的元素
        System.out.println("1.使用传统方式来获取名字长度为3的元素");
        List<String> result=new ArrayList<>();
        for (String name : list) {
            if(name.length()==3){
                result.add(name);
            }
        }
        for (String name : result) {
            System.out.println(name);
        }

        System.out.println("2.使用传统方式来获取名字姓刘的元素");
        List<String> liuList=new ArrayList<>();
        for (String name : list) {
            if(name.startsWith("刘")){
                liuList.add(name);
            }
        }
        for (String name : liuList) {
            System.out.println(name);
        }

    }

    /**
     * StreamAPI 不需要遍历集合，也不需要创建新的集合存储结果
     */
    @Test
    public void testStreamAPI(){
        System.out.println("1.使用StreamAPI来获取名字长度为3的元素");

        list.stream().filter((name)->name.length()==3).forEach((name)->{
            System.out.println(name);
        });

        System.out.println("2.使用StreamAPI来获取名字姓刘的元素");
        list.stream().filter((name)->name.startsWith("刘")).forEach((name)->System.out.println(name));
    }

    /**
     * Collection获取Stream
     */
    @Test
    public void testCollectionGetStream(){
        List<String> list=new ArrayList<>();
        list.add("北京");
        list.add("上海");
        list.add("广州");
        list.add("深圳");
        //用List获取Stream
        Stream<String> listStream = list.stream();

        Set<String> set=new HashSet<>(list);
        Stream<String> setStream = set.stream();
    }

    /**
     * Map集合获取Stream3种方式
     */
    @Test
    public void testMapGetStream(){
        Map<String,String> map=new HashMap<>();
        map.put("中国","北京");
        map.put("德国","柏林");
        map.put("英国","伦敦");
        Stream<String> setStream = map.keySet().stream();
        Stream<String> collectionStream = map.values().stream();
        Stream<Map.Entry<String, String>> entreySetStream = map.entrySet().stream();
    }

    /**
     * 数组获取Stream
     */
    @Test
    public void testArrayGetStream(){
        String[] cities={"北京","上海","广州","深圳"};
        Stream<String> arrayStream = Stream.of(cities);
    }

    /**
     * Stream的forEach方法使用
     */
    @Test
    public void testStreamForEach(){
        list.stream().forEach((name)->{
            System.out.println(name);
        });
    }

    /**
     * Stream的count方法使用
     */
    @Test
    public void testStreamCount(){
        long count = list.stream().count();
        System.out.println("list集合中元素个数为"+count);
    }

    /**
     * Stream的filter方法使用
     */
    @Test
    public void testStreamFilter(){
        list.stream().filter((name)->{
            System.out.println("执行filter方法");
            return name.length()==3;
        }).forEach(System.out::println);
    }

    /**
     * Stream的limit方法使用
     */
    @Test
    public void testStreamLimit(){
        list.stream().filter((name)->name.length()==3).limit(2)
                .forEach(name-> System.out.println(name));
    }

    /**
     * Stream的skip方法使用
     */
    @Test
    public void testStreamSkip(){
        System.out.println("skip前**************");
        list.stream().forEach((name)->{
            System.out.println(name);
        });
        System.out.println("skip后**************");
        list.stream().skip(2).forEach((name)->{
            System.out.println(name);
        });
    }

    /**
     * Stream的map方法使用
     * 将集合元素的字符串类型转换为整数（Integer)类型
     */
    @Test
    public void testStreamMap(){
        List<String> orderStrIdList=new ArrayList<>();
        orderStrIdList.add("10000");
        orderStrIdList.add("10001");
        orderStrIdList.add("10002");
        System.out.println("转换前的集合");
        for (String orderStrId : orderStrIdList) {
            System.out.println(orderStrId);
        }

        List<Integer> orderIdList=new ArrayList<>();

        orderStrIdList.stream().map((orderStrId)->{
            //将字符串订单号转换为整数订单号
            return Integer.valueOf(orderStrId);
        }).forEach((orderId)->{
            orderIdList.add(orderId);
        });
        System.out.println("将集合元素的字符串类型转换为整数（Integer)类型");
        for (Integer orderId : orderIdList) {
            System.out.println(orderId);
        }
    }

    /**
     * Stream的map方法使用
     * 将集合元素的字符串转换为字符串
     */
    @Test
    public void testStreamMapString(){
        List<String> orderStrIdList=new ArrayList<>();
        orderStrIdList.add("10000");
        orderStrIdList.add("10001");
        orderStrIdList.add("10002");
        System.out.println("转换前的集合");

        List<String> taoBaoOrderIdList=new ArrayList<>();

        orderStrIdList.stream().map((orderStrId)->{
            return "TB"+orderStrId;
        }).forEach((taoBaoOrderStrId)->{
            taoBaoOrderIdList.add(taoBaoOrderStrId);
        });
        System.out.println("转换后的集合");
        for (String taoBaoOrderId : taoBaoOrderIdList) {
            System.out.println(taoBaoOrderId);
        }
    }

    /**
     * Stream的collect方法使用
     * 将集合元素收集到另一个集合
     */
    @Test
    public void testStreamCollect(){
        List<String> collectList = list.stream().filter(name->name.length()==3).collect(Collectors.toList());
        for (String name : collectList) {
            System.out.println(name);
        }
    }
}

package net.addit.java.api.util;

import net.addit.java.foundational.oop.Cellphone;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * List接口的常用方法的使用
 *
 * @author tony 241963698@qq.com
 * @version 2022/9/19 下午1:31
 * @since JDK11
 */
public class ListTest {

    List<String> cities;
    List<Cellphone> cellphoneList;

    @BeforeClass
    public void initList(){
        cities=new ArrayList<>();
        cities.add("北京");
        cities.add("上海");
        cities.add("广州");
        cities.add("深圳");
        System.out.println(cities);

        cellphoneList=new ArrayList<>();
        //往集合中添加3个匿名Cellphone对象
        cellphoneList.add(new Cellphone("iphone14",9999));
        cellphoneList.add(new Cellphone("samsung s21",6999));
        cellphoneList.add(new Cellphone("huawei mate50",8999));
    }

    /**
     * List集合的基本特征
     */
    @Test
    public void testListFeature(){
        List<String> cities=new ArrayList<>();
        cities.add("北京");
        cities.add("上海");
        cities.add("广州");
        cities.add("深圳");
        System.out.println(cities);
    }

    /**
     * List集合的add方法和addAll方法
     */
    @Test
    public void testListAddAll(){
        List<String> cities=new ArrayList<>();
        cities.add(0,"北京");
        cities.add(0,"上海");
        cities.add(0,"广州");
        cities.add(0,"深圳");
        System.out.println(cities);

        List<String> otherCities=new ArrayList<>();
        otherCities.add("重庆");
        otherCities.add("成都");
        otherCities.add("武汉");
        otherCities.add("杭州");

        int index=cities.size();
        cities.addAll(index,otherCities);
        System.out.println("往集合中添加新集合后，集合的元素为："+cities);
    }

    /**
     * List集合get方法获取元素
     */
    @Test
    public void testListGet(){
        String city = cities.get(0);
        System.out.println("集合中第0个元素是："+city);

        int index=cities.size();
        String lastCity=cities.get(index-1);
        System.out.println("集合中最后一个元素是："+lastCity);
    }

    /**
     * List集合indexOf获取索引
     */
    @Test
    public void testListIndexOfLastIndexOf(){

        int beijingIndex = cities.indexOf("北京");
        System.out.println("北京在cities集合中第一次出现的索引:"+beijingIndex);

        int shanghaiLastIndex = cities.lastIndexOf("上海");
        System.out.println("上海在cities集合中最后一次出现的索引:"+shanghaiLastIndex);

    }

    /**
     * List集合remove删除元素
     */
    @Test
    public void testListRemove(){
        cities.remove(1);
        cities.remove(1);
        //删除两个元素后，长度已经没有3了，所以无法删除索引为2的元素，会报outofbound
        //cities.remove(2);
        System.out.println(cities);

    }

    /**
     * List集合set修改指定索引元素
     */
    @Test
    public void testListSet(){

        cities.set(3,"天津");
        //set方法的索引需要合法，不能超出范围
        //cities.set(4,"天津");

        System.out.println(cities);

    }

    /**
     * List集合subList截取指定范围的集合
     */
    @Test
    public void testListSubList() {

        List<String> subCities = cities.subList(2, 4);

        System.out.println(subCities);
    }

    /**
     * 使用Iterator遍历List集合,问题：ConcurrentModificationException异常
     */
    @Test
    public void testListIteratorException(){
        System.out.println("使用Iterator遍历List集合");
        Iterator<String> iterator=cities.iterator();
        while (iterator.hasNext()){
            String city=iterator.next();
            //在迭代时不能使用list接口方法修改集合，否则会产生ConcurrentModificationException异常
            //cities.remove("深圳");

            if(city.equals("深圳")){
                iterator.remove();
            }else{
                System.out.println(city);
            }

        }
        System.out.println("当前集合的元素包括："+cities);
    }

    /**
     * List集合的遍历方法
     */
    @Test
    public void testListIterator(){

        System.out.println("-------------方式1：使用Iterator遍历List集合----------");

        Iterator<Cellphone> iterator=cellphoneList.iterator();
        //快捷键itit
        while (iterator.hasNext()) {
            Cellphone cellphone =  iterator.next();
            System.out.println(cellphone);
        }

        System.out.println("------------方式2：使用增强for循环遍历List集合----------");

        for (Cellphone cellphone : cellphoneList) {
            System.out.println(cellphone);
        }

        System.out.println("------------方式3：使用for循环遍历List集合----------");

        for (int i = 0; i < cellphoneList.size(); i++) {
            System.out.println(cellphoneList.get(i));
        }

    }

    /**
     * List集合的排序:按照价格从低到高升序
     */
    @Test
    public void testListSortASC(){

        System.out.println("排序前cellphoneList集合的元素内容");
        for (Cellphone cellphone : cellphoneList) {
            System.out.println(cellphone);
        }

        cellphoneList.sort(new Comparator<Cellphone>() {
            @Override
            public int compare(Cellphone cellphone1, Cellphone cellphone2) {
                return cellphone1.getPrice()-cellphone2.getPrice();
            }
        });
        System.out.println("按照价格从低到高升序cellphoneList集合");
        for (Cellphone cellphone : cellphoneList) {
            System.out.println(cellphone);
        }

    }
}

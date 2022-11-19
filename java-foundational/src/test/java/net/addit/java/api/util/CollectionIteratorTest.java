package net.addit.java.api.util;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Collection集合的遍历
 *
 * @author tony 241963698@qq.com
 * @version 2022/9/8 下午12:43
 * @since JDK11
 */
public class CollectionIteratorTest {

    Collection<String> collection;

    @BeforeClass
    public void initCollection(){
        collection=new ArrayList<>();
        collection.add("北京");
        collection.add("上海");
        collection.add("广州");
        collection.add("深圳");
        System.out.println("Collection集合的元素："+collection);
    }

    /**
     * 使用Iterator遍历Collection
     */
    @Test
    public void testCollectionIterator(){
        System.out.println("使用Iterator遍历集合");
        Iterator<String> iterator=collection.iterator();
        while (iterator.hasNext()){
            String city=iterator.next();
            System.out.println(city);
        }
    }

    /**
     * 使用Iterator遍历Collection集合的问题：NoSuchElementException异常
     */
    @Test
    public void testCollectionIteratorNoSuchElementException(){
        System.out.println("使用Iterator遍历集合");
        Iterator<String> iterator=collection.iterator();
        while (iterator.hasNext()){
            String city=iterator.next();
            System.out.println(city);
        }
        String city=iterator.next();
        System.out.println(city);
    }

    /**
     * 使用Iterator遍历Collection集合的问题：ConcurrentModificationException异常
     */
    @Test
    public void testCollectionIteratorConcurrentModificationException(){
        System.out.println("使用Iterator遍历集合");
        Iterator<String> iterator=collection.iterator();
        while (iterator.hasNext()){
            String city=iterator.next();
            //在迭代时不能使用Collection接口方法修改集合，否则会产生ConcurrentModificationException异常
            //collection.remove("深圳");

            if(city.equals("深圳")){
                iterator.remove();
            }else{
                System.out.println(city);
            }

        }
        System.out.println("当前集合的元素包括："+collection);
    }

    /**
     * 使用增强for循环遍历集合
     */
    @Test
    public void testForeachCollectionArray(){
        for (String city : collection) {
            //也会出异常
            //collection.remove("深圳");
            System.out.println(city);
        }

        Object[] objects = collection.toArray();
        for (Object city : objects) {
            System.out.println(city);
        }
    }
}

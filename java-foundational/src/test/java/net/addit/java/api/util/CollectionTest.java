package net.addit.java.api.util;

import net.addit.java.foundational.oop.interfaces.service.Cellphone;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Collection接口常用方法的测试用例
 *
 * @author tony 241963698@qq.com
 * @version 2022/9/7 下午1:40
 * @since JDK11
 */
public class CollectionTest {

    Collection<String> collection=new ArrayList<>();

    @BeforeClass
    public void initCollection(){
        collection.add("北京");
        System.out.println("往集合中添加一个元素后 当前集合的元素："+collection);

        Collection<String> subColletion=new ArrayList<>();
        subColletion.add("上海");
        subColletion.add("广州");
        subColletion.add("深圳");

        collection.addAll(subColletion);
        System.out.println("将subCollection的全部元素添加后，当前集合的元素："+collection);
    }

    /**
     * 集合添加元素
     * @see java.util.Collection#add(Object)
     * @see java.util.Collection#addAll(Collection)
     */
    @Test
    public void testCollectionAddAll(){
        //创建一个集合对象，规定了集合存储的元素必须是字符串
        Collection<String> collection=new ArrayList<>();
        collection.add("北京");
        System.out.println("往集合中添加一个元素后 当前集合的元素："+collection);

        Collection<String> subColletion=new ArrayList<>();
        collection.add("上海");
        collection.add("广州");
        collection.add("深圳");

        collection.addAll(subColletion);
        System.out.println("将subCollection的全部元素添加后，当前集合的元素："+collection);

    }

    /**
     * 判断是否包含指定的元素（单个元素，集合）
     * @see java.util.Collection#contains(Object)
     * @see java.util.Collection#containsAll(Collection)
     */
    @Test
    public void testCollectionContainsAll(){
        boolean isContains = collection.contains("北京");
        System.out.println("collection集合中是否包含北京："+isContains);

        Collection<String> sameCollection=new ArrayList<>();
        sameCollection.add("北京");
        sameCollection.add("上海");
        sameCollection.add("广州");
        sameCollection.add("深圳");
        boolean isSame = collection.containsAll(sameCollection);
        System.out.println("collection集合是否包含sameCollection集合："+isSame);
        System.out.println(collection.equals(sameCollection));
    }

    /**
     * 删除指定的元素（单个元素，集合）
     * @see java.util.Collection#remove(Object)
     * @see java.util.Collection#removeAll(Collection)
     */
    @Test
    public void testCollectionRemoveAll(){
        collection.remove("深圳");
        System.out.println("删除深圳之后 当前collection集合的元素"+collection);

        Collection<String> subCollection=new ArrayList<>();
        subCollection.add("北京");
        subCollection.add("广州");
        collection.removeAll(subCollection);
        System.out.println("删除subcollection(北京和广州)之后 当前collection集合的元素"+collection);
    }

    /**
     * 删除集合全部元素（元素，集合）
     * @see Collection#clear()
     */
    @Test
    public void testCollectionClear(){
        collection.clear();
        System.out.println("clear之后 当前collection集合的元素"+collection);
    }

    /**
     * 集合中有多少元素，是否为空
     * @see Collection#size()
     * @see Collection#isEmpty()
     */
    @Test
    public void testCollectionSizeIsEmpty(){
        System.out.println("当前collection集合的元素个数"+collection.size());
        System.out.println("当前collection集合是否为空"+collection.isEmpty());

        collection.clear();
        System.out.println("清空后collection集合的元素个数"+collection.size());
        System.out.println("清空后collection集合是否为空"+collection.isEmpty());
    }

    /**
     * 集合与数组的相互转换
     * @see Collection#toArray()
     */
    @Test
    public void testCollection2Array(){
        Object[] cities=collection.toArray();

        for (Object city : cities) {
            System.out.println(city);
        }

        List<String> otherCities = Arrays.asList("苏州", "重庆", "长沙");

        for (String otherCity : otherCities) {
            System.out.println(otherCity);
        }
    }

    /**
     * Collection的使用
     */
    @Test
    public void testCollectionUsage(){
        List<Cellphone> cellphoneList=new ArrayList<>();
        cellphoneList.add(new Cellphone("iphone12"));
        cellphoneList.add(new Cellphone("小米11ultra"));
        cellphoneList.add(new Cellphone("三星S21ultra"));
        cellphoneList.add(new Cellphone("华为mate50pro"));

        System.out.println(cellphoneList);

    }
}

package net.addit.java.api.util;

import net.addit.java.foundational.oop.Cellphone;
import org.testng.annotations.Test;

import java.util.*;

/**
 * Set集合常用实现类的使用
 *
 * @author tony 241963698@qq.com
 * @version 2022/9/29 下午1:10
 * @since JDK11
 */
public class SetTest {

    /**
     * HashSet的特性
     * 1.无索引，也就意味着没有基于索引的操作集合的方法
     * 2.唯一，元素不允许重复
     * 3.存取无序，存储和取出来的顺序不一致
     */
    @Test
    public void testHashSetFeature(){
        Set<String> hashSet=new HashSet<>();
        hashSet.add("Java");
        hashSet.add("Go");
        hashSet.add("Rust");
        hashSet.add("Java");

        System.out.println("HashSet集合元素的内容是："+hashSet);
        //运行结果是：
        //HashSet集合元素的内容是：[Java, Rust, go]
    }

    /**
     * HashSet集合元素的hashCode方法
     */
    @Test
    public void testHasSetElementHashCode(){
        Set<String> hashSet=new HashSet<>();
        hashSet.add("Java");
        hashSet.add("Go");
        hashSet.add("Rust");
        hashSet.add("Java");

        for (String language : hashSet) {
            System.out.println("集合元素的值"+language+"集合元素的哈希值"+language.hashCode());
        }
    }

    /**
     * 自定义类保持元素唯一：需要重写Cellphone类的equals()和hashCode()方法
     */
    @Test
    public void testHasSetElementAddCellphone(){
        Set<Cellphone> cellphoneHashSet=new HashSet<>();
        //往集合中添加3个匿名Cellphone对象
        cellphoneHashSet.add(new Cellphone("iphone14",9999,200));
        cellphoneHashSet.add(new Cellphone("samsung s21",6999,208));
        cellphoneHashSet.add(new Cellphone("huawei mate50",8999,211));
        cellphoneHashSet.add(new Cellphone("iphone14",9999,200));

        System.out.println("当前cellphoneHashSet集合的元素个数："+cellphoneHashSet.size());

    }

    /**
     * LinkedHashSet集合特性
     * 1.无索引，也就意味着没有基于索引的操作集合的方法
     * 2.唯一，元素不允许重复
     * 3.存取有序，存储和取出来的顺序一致
     * */
    @Test
    public void testLinkedHashSetFeature(){
        Set<String> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add("Java");
        linkedHashSet.add("Go");
        linkedHashSet.add("Rust");
        linkedHashSet.add("Java");

        System.out.println("当前cellphoneHashSet集合的元素个数："+linkedHashSet.size());

        for (String language : linkedHashSet) {
            System.out.println("集合元素的值"+language+"集合元素的哈希值"+language.hashCode());
        }
    }

    /**
     * TreeHashSet集合特性
     * 1.无索引，也就意味着没有基于索引的操作集合的方法
     * 2.唯一，元素不允许重复
     * 3.有序，存储时顺序按照元素对应的默认排序规则
     * */
    @Test
    public void testTreeSetFeature(){
        Set<String> treeSet=new TreeSet<>();
        treeSet.add("java");
        treeSet.add("Go");
        treeSet.add("Rust");
        treeSet.add("java");
        System.out.println("HashSet集合元素的内容是："+treeSet);
    }

    /**
     * 需求：集合元素按照字符串字典降序排序
     * */
    @Test
    public void testTreeSetElementStringDesc(){
        Set<String> treeSet=new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                //整数的降序 后面减前面
                //字符串降序 后面.compareTo(前面)
                return str2.compareTo(str1);
            }
        });
        treeSet.add("Java");
        treeSet.add("Go");
        treeSet.add("Rust");
        treeSet.add("java");
        System.out.println("HashSet集合元素的内容是："+treeSet);
    }
}

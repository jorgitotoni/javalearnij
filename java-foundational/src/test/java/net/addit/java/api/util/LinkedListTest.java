package net.addit.java.api.util;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.LinkedList;

/**
 * LinkedList类及常用方法
 *
 * @author tony 241963698@qq.com
 * @version 2022/9/23 下午2:51
 * @since JDK11
 */
public class LinkedListTest {

    LinkedList<String> linkedList;

    @BeforeClass
    public void initLinkedList(){
        linkedList=new LinkedList<>();
        linkedList.add("北京");
        linkedList.add("上海");
        linkedList.add("广州");
        linkedList.add("深圳");
        System.out.println("初始化后LinkedList集合的元素内容是："+linkedList);
    }

    @Test
    public void testLinkedListAdd(){
        linkedList=new LinkedList<>();
        linkedList.add("北京");
        linkedList.add("上海");
        linkedList.add("广州");
        linkedList.add("深圳");
        System.out.println("当前LinkedList集合的元素内容是："+linkedList);
    }

    /**
     * addFirst和addLast方法，在LinkedList集合首部和尾部添加元素
     */
    @Test
    public void testLinkedListAddFirstAddLast(){
        linkedList.addFirst("香港");
        System.out.println("将香港添加到首部元素集合为"+linkedList);
        linkedList.addLast("成都");
        System.out.println("将成都添加到尾部元素集合为"+linkedList);
    }

    /**
     * getFirst和getLast方法，获取LinkedList集合首部和尾部元素
     */
    @Test
    public void testLinkedListGetFirstGetLast(){
        String first = linkedList.getFirst();
        System.out.println("集合首部元素为"+first);
        String last = linkedList.getLast();
        System.out.println("集合尾部元素为"+last);
    }

    /**
     * removeFirst和removeLast方法，删除LinkedList集合首部和尾部元素
     */
    @Test
    public void testLinkedListRemoveFirstRemoveLast(){
        linkedList.addFirst("香港");
        linkedList.addLast("深圳");
        System.out.println("删除前集合"+linkedList);
        linkedList.removeFirst();
        linkedList.removeLast();
    }

    /**
     * 销毁linkedList，并在销毁前打印集合元素
     */
    @AfterClass
    public void destroy(){
        System.out.println("销毁之前当前的linkedList集合的元素是"+linkedList);
        linkedList=null;
    }

    /**
     * push和pop方法，添加和删除LinkedList集合首部元素
     */
    @Test
    public void testLinkedListPushPop(){
        linkedList.push("香港");
        System.out.println("push后集合元素为"+linkedList);
        linkedList.pop();
        System.out.println("pop后集合元素为"+linkedList);
    }
}

package net.addit.java.api.util;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * ListIterator接口及常用方法
 *
 * @author tony 241963698@qq.com
 * @version 2022/9/21 下午1:32
 * @since JDK11
 */
public class ListIteratorTest {

    List<Integer> list;
    ListIterator<Integer> listIterator;

    @BeforeClass
    public void initList(){
        list=new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        listIterator=list.listIterator();
    }

    /**
     * 使用ListIterator正向遍历List集合
     */
    @Test
    public void testListIterator(){
        ListIterator<Integer> listIterator=list.listIterator();
        System.out.println("*********使用ListIterator正向遍历List集合**********");
        while (listIterator.hasNext()) {
            Integer value =  listIterator.next();

            if(value==4){
                listIterator.remove();
            }else {
                System.out.println(value);
            }
        }
        System.out.println("当前list集合的元素内容是："+list);
    }

    /**
     * 使用ListIterator反向遍历List集合
     */
    @Test
    public void testListIteratorHasPrevious(){
        System.out.println("*********使用ListIterator反向遍历List集合**********");
        //在反向遍历之前必须正向遍历
        while (listIterator.hasNext()) {
            Integer value =  listIterator.next();

        }

        while(listIterator.hasPrevious()){
            Integer previousValue=listIterator.previous();
            System.out.println(previousValue);
        }
    }

    /**
     * nextIndex方法获取下一个元素的索引
     */
    @Test
    public void testListIteratorNextIndex(){
        while (listIterator.hasNext()) {
            Integer value =  listIterator.next();
            int nextIndex=listIterator.nextIndex();
            System.out.println("集合共有"+list.size()+"个元素，当前元素的值为"+value+"下一个元素的索引为："+nextIndex);

        }
    }

    /**
     * previousIndex方法获取上一个元素的索引
     */
    @Test
    public void testListIteratorPreviousIndex(){
        while (listIterator.hasNext()) {
            Integer next =  listIterator.next();

        }
        while (listIterator.hasPrevious()) {
            Integer previousValue =  listIterator.previous();
            int previousIndex=listIterator.previousIndex();
            System.out.println("集合共有"+list.size()+"个元素，当前元素的值为"+previousValue+"上一个元素的索引为："+previousIndex);

        }
    }

    /**
     * add()set()方法添加修改元素
     */
    @Test
    public void testListIteratorAddSet(){
        while (listIterator.hasNext()) {
            Integer value =  listIterator.next();

            if(value==4){
                listIterator.set(88);
            }
            listIterator.add(6);

            //打印输入迭代器遍历的值
            System.out.println(value);

        }
        System.out.println("list集合的元素是："+list);
    }
}

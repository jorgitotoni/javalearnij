package net.addit.java.api.util;

import net.addit.java.foundational.oop.Cellphone;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Collections常用方法的使用
 *
 * @author tony 241963698@qq.com
 * @version 2022/9/28 下午12:29
 * @since JDK11
 */
public class CollectionsTest {

    List<Integer> list;
    List<Cellphone> cellphoneList;

    @BeforeClass
    public void initList(){
        list=new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7);
        System.out.println("当前list集合的元素内容是"+list);
        cellphoneList=new ArrayList<>();
        //往集合中添加3个匿名Cellphone对象
        cellphoneList.add(new Cellphone("iphone14",9999,208));
        cellphoneList.add(new Cellphone("samsung s21",6999,205));
        cellphoneList.add(new Cellphone("huawei mate50",6999,199));

        System.out.println("************cellphoneList集合初始化后的元素内容是************");
        printlnCellphoneList(cellphoneList);
    }

    /**
     * 遍历集合的元素
     * @param cellphoneList
     */
    public void printlnCellphoneList(List<Cellphone> cellphoneList){
        for (Cellphone cellphone : cellphoneList) {
            System.out.println(cellphone);
        }
    }

    /**
     * 往指定的集合添加多个元素
     */
    @Test
    public void testCollectionsAddAll(){
        List<Integer> list=new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7);
        System.out.println("当前list集合的元素内容是"+list);
    }

    /**
     * 打乱集合元素的顺序
     */
    @Test
    public void testCollectionsShuffle(){
        Collections.shuffle(list);
        System.out.println("打乱顺序后的集合是"+list);
    }

    /**
     * 集合元素排序
     */
    @Test
    public void testCollectionsSort(){
        Collections.shuffle(list);
        System.out.println("打乱顺序后的集合是"+list);
        Collections.sort(list);
        System.out.println("按照默认顺序排序后的集合是"+list);
        //按照自定义规则：降序
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //降序是后面减前面
                return o2-o1;
            }
        });
        System.out.println("按照指定顺序排序后的集合是"+list);
    }

    /**
     * 集合元素的排序：自定义类的集合
     * 需求1.按照价格降序排序
     * 需求2.按照价格升序排序，如果价格相同，按照重量升序排序
     */
    @Test
    public void testCollectionsSortCellphone(){

        Collections.sort(cellphoneList);
        System.out.println("************需求1.cellphoneList集合按照价格降序排序后的内容是************");
        printlnCellphoneList(cellphoneList);


        Collections.sort(cellphoneList, new Comparator<Cellphone>() {
            @Override
            public int compare(Cellphone cellphone1, Cellphone cellphone2) {

                //需求2.按照价格升序排序，如果价格相同，按照重量升序排序
                //此处不能用cellphone1.getPrice()==cellphone2.getPrice(),因为会比较地址
                if(cellphone1.getPrice().equals(cellphone2.getPrice())){
                    return cellphone1.getWeight()-cellphone2.getWeight();
                }
                return cellphone1.getPrice()-cellphone2.getPrice();
            }
        });
        System.out.println("************需求2.cellphoneList集合按照升序排序后的内容是************");
        printlnCellphoneList(cellphoneList);
    }

    /**
     * binarySearch()方法查找集合元素：基于二分法，因此需要先对集合排序
     */
    @Test
    public void testCollectionsBinarySearch(){
        Collections.addAll(list,100,200,300,80,88,102,120,999,1008,20,30);
        System.out.println("当前集合元素内容"+list);
        Collections.sort(list);
        int targetElement=1008;
        int targetIndex = Collections.binarySearch(list, targetElement);
        if(targetIndex>=0){
            System.out.println("找到了"+targetElement+"他的索引是"+targetIndex);
        }else{
            System.out.println(targetElement+"没有找到");
        }
    }
}

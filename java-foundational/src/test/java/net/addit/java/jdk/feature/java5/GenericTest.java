package net.addit.java.jdk.feature.java5;

import net.addit.java.foundational.oop.inheritance.Cellphone;
import net.addit.java.foundational.oop.inheritance.SmartPhone;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 泛型的使用
 *
 * @author tony 241963698@qq.com
 * @version 2022/10/6 下午6:10
 * @since JDK11
 */
public class GenericTest {

    /**
     * 没有泛型的问题
     */
    @Test
    public void testListWithoutGeneric(){
        List list=new ArrayList();
        list.add("Java");
        list.add(100);
        list.add(3.14);

        for (Object object : list) {
            //如果不做类型判断，可能会发生转换类型异常
            //java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String
            //String str=(String) object;
            //System.out.println("字符串的长度为："+str.length());

            if(object instanceof String){
                String str=(String) object;
                System.out.println("字符串的长度为："+str.length());
            }

            System.out.println(object);
        }
    }

    /**
     * 泛型集合
     */
    @Test
    public void testListWithGeneric(){
        List<String> list=new ArrayList<>();
        list.add("Java");
        list.add("MySQL");
        list.add("Linux");
        //编译期的类型检查
        //list.add(100);

    }

    /**
     * 泛型类的使用
     * 创建泛型类的对象时，必须指定泛型的具体类型
     */
    @Test
    public void testGenericClassUsage(){

        //创建泛型类的对象时，必须指定泛型的具体类型
        FastArrayList<String> fastArrayList=new FastArrayList<>();
        fastArrayList.addElement("Java");
        fastArrayList.addElement("MySQL");
        fastArrayList.addElement("Linux");
        System.out.println(fastArrayList);
    }

    /**
     * 泛型接口的使用
     */
    @Test
    public void testGenericInterfaceUsage(){
        //使用泛型接口创建实现类对象，必须指定泛型接口的具体类型
        FastList<String> fastList=new FastArrayList<>();
        fastList.add("Java");
        fastList.add("MySQL");
        fastList.add("Linux");
        System.out.println(fastList);

    }

    /**
     * 将数组拷贝到List集合
     * @param array 数组，数组的元素是T，T是泛型类型，在定义时不确定的类型，在调用方法时替换成具体类型
     * @param <T>
     * @return
     */
    public <T> List<T> copyFromArrayToList(T[] array){
        List<T> data=new ArrayList<>();
        for (T element : array) {
            data.add(element);
        }
        return data;
    }

    /**
     * 泛型方法的使用
     */
    @Test
    public void testCopyFromArrayToList(){

        String[] strArray={"Java","Go","Rust"};
        List<String> languageList = copyFromArrayToList(strArray);
        System.out.println("将字符串数组的内容拷贝到List集合的结果是："+languageList);

        //int数组不可以
        //int[] intArray={1,2,3,4,5,6};
        //List<T> ts = copyFromArrayToList(intArray);

        Integer[] integerArray={1,2,3,4,5,6};
        List<Integer> integerList = copyFromArrayToList(integerArray);
        System.out.println("将整数数组的内容拷贝到List集合的结果是："+integerList);

    }

    public void printStringList(List<String> stringList){
        System.out.println("遍历集合，集合的元素是字符串");
        for (String string : stringList) {
            System.out.println(string);
        }
    }

    public void printIntList(List<Integer> intList){
        System.out.println("遍历集合，集合的元素是整数");
        for (Integer integer : intList) {
            System.out.println(integer);
        }
    }

    /**
     * 通用打印List，List集合的元素可以为任意类型，这就是通配符的作用
     * @param elements
     */
    public void printData(List<?> elements){

        //集合在使用泛型通配符时，不能写数据。因为只会把集合元素当成Object。
        //elements.add("hahaha");

        System.out.println("遍历集合，集合的元素是Object");
        for (Object element : elements) {
            System.out.println(element);
        }
    }

    /**
     * 泛型通配符的使用
     */
    @Test
    public void testGenericWildcardCharacter(){
        String[] strArray={"Java","Go","Rust"};
        List<String> languageList = copyFromArrayToList(strArray);

        //printStringList(languageList);
        printData(languageList);

        Integer[] integerArray={1,2,3,4,5,6};
        List<Integer> integerList = copyFromArrayToList(integerArray);

        //printIntList(integerList);
        printData(integerList);
    }

    /**
     * 显示手机信息
     * 定义泛型通配符的上限的泛型方法
     * @param cellphoneList
     * @param <T> Cellphone和它的子类
     */
    public <T extends Cellphone> void showCellphoneInfo(List<T> cellphoneList){
        System.out.println("显示手机的信息");
        for (T cellphone : cellphoneList) {
            System.out.println(cellphone);
        }
    }

    /**
     * 使用泛型通配符的上限的泛型方法
     */
    @Test
    public void testGenericWildcardCharacterUp(){
        List<Cellphone> cellphoneList=new ArrayList<>();
        cellphoneList.add(new Cellphone("iphone13"));
        cellphoneList.add(new SmartPhone("huaweiP50 pro"));
        showCellphoneInfo(cellphoneList);
    }

    /**
     * 打印List集合的元素，List集合元素必须是Integer及它的父类Number
     * 定义泛型通配符的下限的泛型方法
     * @param list
     */
    public void printList(List<? super Integer> list){
        for (Object object : list) {
            System.out.println(object);
        }
    }

    /**
     * 使用泛型通配符的下限的泛型方法
     */
    @Test
    public void testGenericWildcardCharacterDown(){

        System.out.println("************集合的元素是Integer************");
        List<Integer> integerList=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        printList(integerList);

        System.out.println("************集合的元素是Integer的父类Number************");
        List<Number> numberList=new ArrayList<>(Arrays.asList(100,200,300,400,500,600,700));
        printList(numberList);

    }
}

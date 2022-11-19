package net.addit.java.api.util;

import net.addit.java.foundational.oop.Cellphone;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.*;

/**
 * Map接口的常用方法
 *
 * @author tony 241963698@qq.com
 * @version 2022/10/3 下午8:51
 * @since JDK11
 */
public class MapTest {

    Map<String,String> map;

    @BeforeClass
    public void initLinkedHashMap(){
        map=new LinkedHashMap<>();
        map.put("中国","北京");
        map.put("韩国","首尔");
        map.put("日本","东京");
        map.put("美国","纽约");
        map.put("新加坡","新加坡");
        System.out.println("初始化后当前map集合元素的内容"+map);
    }

    /**
     * 添加元素put方法
     */
    @Test
    public void testMapPut(){
        Map<String,String> map=new LinkedHashMap<>();
        map.put("中国","北京");
        map.put("韩国","首尔");
        map.put("日本","东京");
        map.put("美国","纽约");
        map.put("新加坡","新加坡");
        System.out.println("当前map集合元素的内容"+map);

        Map<String,String> subMap=new HashMap<>();
        subMap.put("法国","巴黎");
        subMap.put("英国","伦敦");
        subMap.put("德国","柏林");
        subMap.put("意大利","罗马");
        System.out.println("当前subMap集合元素的内容"+subMap);

        map.putAll(subMap);
        System.out.println("添加subMap后map集合元素的内容"+map);
    }

    /**
     * 删除元素remove方法
     */
    @Test
    public void testMapRemove(){
        String valueRemoved = map.remove("日本");
        System.out.println("原map集合删除日本对应的键值对后的map集合"+map);
        System.out.println("日本键值对的值为"+valueRemoved);
    }

    /**
     * 替换元素replace方法
     */
    @Test
    public void testMapReplace(){
        map.replace("新加坡","新加坡城");
        System.out.println("替换后的map对应的元素内容"+map);
        boolean replaceResult = map.replace("日本", "东京", "京都");
        System.out.println("替换后的map对应的元素内容"+map);
        System.out.println("替换是否成功?"+replaceResult);
    }

    /**
     * 判断集合是否包含key或value
     */
    @Test
    public void testMapContainsKeyContainsValue(){
        boolean isContainsKey = map.containsKey("日本");
        boolean isContainsValue = map.containsValue("大阪");
        System.out.println("map集合是否包含key日本"+isContainsKey);
        System.out.println("map集合是否包含value大阪"+isContainsValue);
    }

    /**
     * 分别获取集合中所有key和value
     */
    @Test
    public void testMapKeySetValues(){
        Set<String> allCountries = map.keySet();
        System.out.println("map集合所有的key有"+allCountries);
        Collection<String> allCapitals = map.values();
        System.out.println("map集合所有的values有"+allCapitals);
    }

    /**
     * 分别获取集合中所有键值对
     */
    @Test
    public void testMapEntrySet(){
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        System.out.println("map中所有键值对为"+entrySet);
        for (Map.Entry<String, String> entry : entrySet) {
            String country = entry.getKey();
            String capital = entry.getValue();
            Class<? extends Map.Entry> aClass = entry.getClass();
            System.out.println("国家"+country+"     首都"+capital+"      本键值对类为"+aClass);
        }
    }

    /**
     * 遍历Map集合的方法
     */
    @Test
    public void testMapTraversal(){
        System.out.println("*****方式1.根据键找值******");

        Set<String> allKey = map.keySet();
        for (String key : allKey) {
            String value = map.get(key);
            System.out.println("键:"+key+"     值:"+value);

        }

        System.out.println("*****方式2.根据键值对遍历******");
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            String country = entry.getKey();
            String capital = entry.getValue();
            System.out.println("国家:" + country + "     首都:" + capital);
        }
    }

    /**
     * HashMap的特点
     * 1.键唯一，由哈希表保证唯一
     * 2.键值对存取无序
     */
    @Test
    public void testHashMapFeature(){
        Map<Cellphone,String> cellphoneStringMap=new HashMap<>();
        cellphoneStringMap.put(new Cellphone("小米12 ultra",10999,218),"小米");
        cellphoneStringMap.put(new Cellphone("华为mate50 pro",11999,228),"华为");
        cellphoneStringMap.put(new Cellphone("iphone 14 pro max",12999,238),"苹果");
        cellphoneStringMap.put(new Cellphone("小米12 ultra",10999,218),"小米");
        System.out.println("当前map集合元素个数有"+cellphoneStringMap.size());
        System.out.println("***************当前map集合元素有*******************");
        Set<Map.Entry<Cellphone, String>> entries = cellphoneStringMap.entrySet();
        for (Map.Entry<Cellphone, String> entry : entries) {
            Cellphone cellphone = entry.getKey();
            String name = entry.getValue();
            System.out.println("手机："+cellphone+"   厂商："+name);
        }
    }

    /**
     * LinkedHashMap的特点
     * 1.键唯一，由哈希表保证唯一
     * 2.存取有序
     */
    @Test
    public void testLinkedHashMapFeature(){
        Map<Cellphone,String> cellphoneStringMap=new LinkedHashMap<>();
        cellphoneStringMap.put(new Cellphone("小米12 ultra",10999,218),"小米");
        cellphoneStringMap.put(new Cellphone("华为mate50 pro",11999,228),"华为");
        cellphoneStringMap.put(new Cellphone("iphone 14 pro max",12999,238),"苹果");
        cellphoneStringMap.put(new Cellphone("小米12 ultra",10999,218),"小米");
        System.out.println("当前map集合元素个数有"+cellphoneStringMap.size());
        System.out.println("***************当前map集合元素有*******************");
        Set<Map.Entry<Cellphone, String>> entries = cellphoneStringMap.entrySet();
        for (Map.Entry<Cellphone, String> entry : entries) {
            Cellphone cellphone = entry.getKey();
            String name = entry.getValue();
            System.out.println("手机："+cellphone+"   厂商："+name);
        }
    }

    /**
     * TreeMap的特点
     * 1.键唯一，由哈希表保证唯一
     * 2.元素有序：按元素的默认排序，前提是元素所属的类实现了Comparable接口的compareTo()方法
     */
    @Test
    public void testTreeMapFeature(){
        Map<Cellphone,String> cellphoneStringMap=new TreeMap<>();
        cellphoneStringMap.put(new Cellphone("小米12 ultra",10999,218),"小米");
        cellphoneStringMap.put(new Cellphone("华为mate50 pro",11999,228),"华为");
        cellphoneStringMap.put(new Cellphone("iphone 14 pro max",12999,238),"苹果");
        cellphoneStringMap.put(new Cellphone("小米12 ultra",10999,218),"小米");
        System.out.println("当前map集合元素个数有"+cellphoneStringMap.size());
        System.out.println("***************当前map集合元素有*******************");
        Set<Map.Entry<Cellphone, String>> entries = cellphoneStringMap.entrySet();
        for (Map.Entry<Cellphone, String> entry : entries) {
            Cellphone cellphone = entry.getKey();
            String name = entry.getValue();
            System.out.println("手机："+cellphone+"   厂商："+name);
        }
    }

    /**
     * TreeMap的自定义排序
     */
    @Test
    public void testTreeMapCustomSort(){
        Map<Cellphone,String> cellphoneStringMap=new TreeMap<>(new Comparator<Cellphone>() {
            @Override
            public int compare(Cellphone cellphone1, Cellphone cellphone2) {
                return cellphone1.getModel().compareTo(cellphone2.getModel());
            }
        });
        cellphoneStringMap.put(new Cellphone("小米12 ultra",10999,218),"小米");
        cellphoneStringMap.put(new Cellphone("华为mate50 pro",11999,228),"华为");
        cellphoneStringMap.put(new Cellphone("iphone 14 pro max",12999,238),"苹果");
        cellphoneStringMap.put(new Cellphone("小米12 ultra",10999,218),"小米");
        System.out.println("当前map集合元素个数有"+cellphoneStringMap.size());
        System.out.println("***************当前map集合元素有*******************");
        Set<Map.Entry<Cellphone, String>> entries = cellphoneStringMap.entrySet();
        for (Map.Entry<Cellphone, String> entry : entries) {
            Cellphone cellphone = entry.getKey();
            String name = entry.getValue();
            System.out.println("手机："+cellphone+"   厂商："+name);
        }
    }
}

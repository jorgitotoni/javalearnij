package net.addit.java.api.util;

import net.addit.java.foundational.oop.interfaces.service.Cellphone;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 集合和数组的对比
 *
 * @author tony 241963698@qq.com
 * @version 2022/9/7 下午1:12
 * @since JDK11
 */
public class CollectionCompareArray {

    public static void main(String[] args) {
        int[] numbers={1,2,3};
        Cellphone[] cellphones={new Cellphone("iphone12")};

        Collection container=new ArrayList();
        container.add(1);
        container.add("tony");
        container.add(3.14);
        container.add(true);
        container.add(new Cellphone("mate50"));

        //单列集合，添加的都是对象
        Collection<String> stringContainer=new ArrayList<>();
        stringContainer.add("tony");
        stringContainer.add("1");

        //双列集合,添加的都是key-value键值对
        Map<String,String> map=new HashMap<>();
        map.put("姓名","tony");
        map.put("年龄","19");

    }
}

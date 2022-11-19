package net.addit.java.jdk.feature.java5;

import java.util.ArrayList;

/**
 * 泛型类的定义
 *
 * @author tony 241963698@qq.com
 * @version 2022/10/6 下午6:33
 * @since JDK11
 */
public class FastArrayList<E> extends ArrayList<E> implements FastList<E> {

    public boolean addElement(E element){
        return add(element);
    }
}

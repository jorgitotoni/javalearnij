package net.addit.java.foundational.oop.interfaces.service;

/**
 * 比较器
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/25 下午1:44
 * @since JDK11
 */
public interface Comparator<T> {
    /**
     * 两个对象的比较
     * 如果source大于target返回1
     * 如果source小于target返回-1
     * 如果source等于target返回0
     * @param source
     * @param target
     * @return
     */
    int compare(T source,T target);
}

package net.addit.java.foundational.oop.interfaces.service;

/**
 * 按重量排序
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/25 下午1:55
 * @since JDK11
 */
public class SortByWeight implements Comparator<Cellphone>{
    @Override
    public int compare(Cellphone source, Cellphone target) {
        return source.getWeight()- target.getWeight();
    }
}

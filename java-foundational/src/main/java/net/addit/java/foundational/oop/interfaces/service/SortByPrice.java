package net.addit.java.foundational.oop.interfaces.service;

/**
 * 价格比较
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/25 下午1:47
 * @since JDK11
 */
public class SortByPrice implements Comparator<Cellphone>{
    @Override
    public int compare(Cellphone source, Cellphone target) {
        return source.getPrice()- target.getPrice();
    }
}

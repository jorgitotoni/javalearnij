package net.addit.java.api.io.designpattern;

/**
 * 统一数据访问接口
 *
 * @author tony 241963698@qq.com
 * @version 2022/11/19 上午10:33
 * @since JDK11
 */
public interface BaseDao<T> {

    /**
     * 添加元素
     * @param element
     * @return 受影响的行数
     */
    int add(T element);

    /**
     * 删除数据
     * @param element
     * @return 受影响的行数
     */
    int delete(T element);

    /**
     * 获取元素
     * @param element
     * @return 获取的元素
     */
    T get(T element);
}

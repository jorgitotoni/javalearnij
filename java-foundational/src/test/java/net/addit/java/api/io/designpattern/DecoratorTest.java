package net.addit.java.api.io.designpattern;

import net.addit.java.foundational.oop.Cellphone;

/**
 * 装饰者模式的使用
 *
 * @author tony 241963698@qq.com
 * @version 2022/11/19 上午10:32
 * @since JDK11
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Cellphone cellphone=new Cellphone();
        cellphone.setPrice(8888);
        cellphone.setColor("黑色");
        cellphone.setWeight(228);
        cellphone.setModel("华为P50 pro plus");
        cellphone.setBrand("华为");

        BaseDao<Cellphone> baseDao=new DefaultBaseDaoImpl<>();
        //没有增强的get：直接从数据库获取数据
        System.out.println("**************没有增强的get：直接从数据库获取数据**************");
        Cellphone fromDBCellphone = baseDao.get(cellphone);
        System.out.println(fromDBCellphone);

        //增强的get：先从缓存中获取数据，缓存中没有再从数据库中获取
        BaseDao<Cellphone> cacheDao=new CacheDaoImpl<>(baseDao);
        System.out.println("**************增强的get：先从缓存中获取数据，缓存中没有再从数据库中获取**************");
        Cellphone fromCacheCellphone = cacheDao.get(cellphone);
        System.out.println(fromCacheCellphone);

    }
}

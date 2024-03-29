package net.addit.java.api.io.designpattern;

/**
 * 装饰类：缓存的实现
 *
 * @author tony 241963698@qq.com
 * @version 2022/11/19 上午11:56
 * @since JDK11
 */
public class CacheDaoImpl<T> implements BaseDao<T>{
    final BaseDao<T> baseDao;

    CacheDaoImpl(final BaseDao<T> baseDao){
        this.baseDao=baseDao;
    }

    @Override
    public int add(T element) {
        return baseDao.add(element);
    }

    @Override
    public int delete(T element) {
        return baseDao.delete(element);
    }

    /**
     * 增强get方法
     * 首先从缓存获取数据，如果缓存中没有，再从数据库中获取数据
     * @param element
     * @return
     */
    @Override
    public T get(T element) {
        if(null!=element){
            T fromCache = getFromCache(element);
            if(null!=fromCache){
                System.out.println("从缓存中获取数据成功");
                return fromCache;
            }else{
                System.out.println("从数据库中获取数据成功");
                return baseDao.get(element);
            }
        }
        return null;
    }

    /**
     * 从缓存中获取数据
     * @param element
     * @param <T>
     * @return
     */
    private <T> T getFromCache(T element){
        if(null!=element){
            return element;
        }
        return null;
    }
}

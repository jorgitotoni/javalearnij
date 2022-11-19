package net.addit.java.api.util;

import org.testng.annotations.Test;

import java.util.*;

/**
 * 集合的嵌套使用
 *
 * @author tony 241963698@qq.com
 * @version 2022/10/4 下午8:49
 * @since JDK11
 */
public class ListNestedMapTest {

    /**
     * List嵌套List
     */
    @Test
    public void testListNestedList(){
        List<String> asia=new ArrayList<>();
        asia.add("中国");
        asia.add("日本");
        asia.add("韩国");

        List<String> europe=new ArrayList<>();
        europe.add("英国");
        europe.add("法国");
        europe.add("德国");

        List<List<String>> world=new ArrayList<>();
        world.add(asia);
        world.add(europe);
        //List嵌套List集合的遍历：
        System.out.println("********************List嵌套List集合的遍历********************");
        for (List<String> continent : world) {
            for (String country : continent) {
                System.out.println(country);
            }

        }
    }

    /**
     * List嵌套Map
     */
    @Test
    public void testListNestedMap(){
        Map<String,String> asiaMap=new TreeMap<>();
        asiaMap.put("中国","北京");
        asiaMap.put("韩国","首尔");
        asiaMap.put("日本","东京");

        Map<String,String> europeMap=new TreeMap<>();
        europeMap.put("英国","伦敦");
        europeMap.put("法国","巴黎");
        europeMap.put("德国","柏林");

        List<Map<String,String>> world=new ArrayList<>();
        world.add(asiaMap);
        world.add(europeMap);

        System.out.println("********************List嵌套Map集合的遍历********************");
        for (Map<String, String> continentMap : world) {
            Set<Map.Entry<String, String>> continent = continentMap.entrySet();
            for (Map.Entry<String, String> countryMap : continent) {
                String country = countryMap.getKey();
                String capital = countryMap.getValue();
                System.out.println("国家："+country+"   首都："+capital);
            }
        }
    }

    /**
     * Map嵌套List
     */
    @Test
    public void testMapNestedList(){
        List<String> cityOfChina=new ArrayList<>();
        cityOfChina.add("北京");
        cityOfChina.add("上海");
        cityOfChina.add("广州");
        cityOfChina.add("深圳");

        List<String> cityOfAmerica=new ArrayList<>();
        cityOfAmerica.add("纽约");
        cityOfAmerica.add("洛杉矶");
        cityOfAmerica.add("华盛顿");
        cityOfAmerica.add("旧金山");

        Map<String,List<String>> worldMap=new TreeMap<>();
        worldMap.put("中国",cityOfChina);
        worldMap.put("美国",cityOfAmerica);

        System.out.println("********************Map嵌套List集合的遍历********************");
        Set<Map.Entry<String, List<String>>> entrySet = worldMap.entrySet();
        for (Map.Entry<String, List<String>> countryMap : entrySet) {
            String country = countryMap.getKey();
            List<String> cities = countryMap.getValue();
            for (String city : cities) {
                System.out.println("国家："+country+"   城市："+city);
            }
        }
    }

    /**
     * Map嵌套Map
     */
    @Test
    public void testMapNestedMap(){
        Map<String,String> asiaMap=new TreeMap<>();
        asiaMap.put("中国","北京");
        asiaMap.put("韩国","首尔");
        asiaMap.put("日本","东京");

        Map<String,String> europeMap=new TreeMap<>();
        europeMap.put("英国","伦敦");
        europeMap.put("法国","巴黎");
        europeMap.put("德国","柏林");

        Map<String,Map<String,String>> worldMap=new TreeMap<>();
        worldMap.put("亚洲",asiaMap);
        worldMap.put("欧洲",europeMap);

        System.out.println("********************Map嵌套Map集合的遍历********************");
        Set<Map.Entry<String, Map<String, String>>> worldEntry = worldMap.entrySet();
        for (Map.Entry<String, Map<String, String>> continentMap : worldEntry) {
            String continent = continentMap.getKey();
            Map<String, String> countryMap = continentMap.getValue();
            Set<Map.Entry<String, String>> countryEntry = countryMap.entrySet();
            for (Map.Entry<String, String> cityMap : countryEntry) {
                String country = cityMap.getKey();
                String capital = cityMap.getValue();
                System.out.println("大洲："+continent+"   国家："+country+"   首都："+capital);
            }
        }

    }
}

package net.addit.java.api.util;

import java.util.*;

/**
 * 斗地主游戏第二个版本
 *
 * @author tony 241963698@qq.com
 * @version 2022/10/5 下午9:13
 * @since JDK11
 */
public class ChinesePokerGameV2 {
    public static void main(String[] args) {
        //1.造牌
        System.out.println("**************步骤一：造牌***************");
        //有一个Map集合放54张牌，给每张牌一个编号，牌从大到小排放
        Map<Integer,String> pokerBox=new HashMap<>();
        int id=0;
        //大小王单独添加
        pokerBox.put(id++,"大王");
        pokerBox.put(id++,"小王");
        //有一个集合放四种花色
        List<String> colors=new ArrayList<>();
        colors.addAll(Arrays.asList("♥","♠","♣","♦"));
        //有一个集合放13张牌：2 A K Q J 10 9 8 7 6 5 4 3
        List<String> numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList("2","A","K","Q","J","10","9","8","7","6","5","4","3"));

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < colors.size(); j++) {
                String pokerCard=colors.get(j)+numbers.get(i);
                pokerBox.put(id++,pokerCard);
            }
        }

        System.out.println("当前扑克牌的数量："+pokerBox.size());
        System.out.println("当前扑克牌："+pokerBox);

        System.out.println("**************步骤二：洗牌***************");
        Set<Integer> idSet = pokerBox.keySet();
        List<Integer> idList=new ArrayList<>(idSet);
        Collections.shuffle(idList);
        System.out.println("洗牌后的扑克牌id："+idList);

        System.out.println("**************步骤三：发牌***************");
        //需要4个集合存3个玩家的牌和底牌的id
        List<Integer> player1Ids=new ArrayList<>();
        List<Integer> player2Ids=new ArrayList<>();
        List<Integer> player3Ids=new ArrayList<>();
        List<Integer> cardsIds=new ArrayList<>();

        //将54张牌的id给3个玩家和底牌
        for (int i = 0; i < idList.size(); i++) {
            Integer pokerCardId=idList.get(i);
            if(i>=51){
                cardsIds.add(pokerCardId);
            }else if(i%3==0){
                player1Ids.add(pokerCardId);
            }else if(i%3==1){
                player2Ids.add(pokerCardId);
            }else if(i%3==2){
                player3Ids.add(pokerCardId);
            }
        }

        //需要4个集合存3个玩家的牌和底牌
        List<String> player1=new ArrayList<>();
        List<String> player2=new ArrayList<>();
        List<String> player3=new ArrayList<>();
        List<String> cards=new ArrayList<>();

        Set<Map.Entry<Integer, String>> entrySet = pokerBox.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet) {
            if(player1Ids.contains(entry.getKey())){
                player1.add(entry.getValue());
            }else if(player2Ids.contains(entry.getKey())){
                player2.add(entry.getValue());
            }else if(player3Ids.contains(entry.getKey())){
                player3.add(entry.getValue());
            }else if(cardsIds.contains(entry.getKey())){
                cards.add(entry.getValue());
            }
        }

        System.out.println("玩家1的牌的数量为"+player1.size());
        System.out.println("玩家1的牌为"+player1);
        System.out.println("玩家2的牌的数量为"+player2.size());
        System.out.println("玩家2的牌为"+player2);
        System.out.println("玩家3的牌的数量为"+player3.size());
        System.out.println("玩家3的牌为"+player3);
        System.out.println("底牌为"+cards);
    }
}

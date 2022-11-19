package net.addit.java.api.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 斗地主游戏第一个版本-集合应用
 *
 * @author tony 241963698@qq.com
 * @version 2022/10/5 下午7:56
 * @since JDK11
 */
public class ChinesePokerGameV1 {
    public static void main(String[] args) {
        //1.造牌
        System.out.println("**************步骤一：造牌***************");
        //有一个集合放54张牌
        List<String> pokerBox=new ArrayList<>();
        //有一个集合放四种花色
        List<String> colors=new ArrayList<>();
        colors.addAll(Arrays.asList("♥","♠","♣","♦"));
        //有一个集合放13张牌：2 A K Q J 10 9 8 7 6 5 4 3
        List<String> numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList("2","A","K","Q","J","10","9","8","7","6","5","4","3"));
        //大小王单独添加
        pokerBox.add("大王");
        pokerBox.add("小王");

        for (String number : numbers) {
            for (String color : colors) {
                String pokerCard=color+number;
                pokerBox.add(pokerCard);
            }
        }

        System.out.println("当前扑克牌的数量："+pokerBox.size());
        System.out.println("当前扑克牌："+pokerBox);

        System.out.println("**************步骤二：洗牌***************");
        Collections.shuffle(pokerBox);
        System.out.println("洗牌后的扑克牌："+pokerBox);

        System.out.println("**************步骤三：发牌***************");
        //需要4个集合存3个玩家的牌和底牌
        List<String> player1=new ArrayList<>();
        List<String> player2=new ArrayList<>();
        List<String> player3=new ArrayList<>();
        List<String> cards=new ArrayList<>();

        for (int i = 0; i < pokerBox.size(); i++) {
            String pokerCard=pokerBox.get(i);
            if(i>=51){
                cards.add(pokerCard);
            }else if(i%3==0){
                player1.add(pokerCard);
            }else if(i%3==1){
                player2.add(pokerCard);
            }else if(i%3==2){
                player3.add(pokerCard);
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

package net.addit.java.foundational.control.whilestatement;

import java.util.Random;
import java.util.Scanner;

/**
 * 猜数字游戏
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/1 下午12:35
 * @since JDK8
 */
public class GuessGame {
    public static void main(String[] args) {
        Random rand=new Random();
        int number=rand.nextInt(100);

        Scanner input=new Scanner(System.in);

        int count=0;

        while(true){
            System.out.println("请猜一个数字：");
            int guessNumber=input.nextInt();
            count++;
            if(guessNumber>number){
                System.out.println("你猜的数字太大了，请重新再猜");
            }else if(guessNumber<number){
                System.out.println("你猜的太小了，请重新再猜");
            }else{
                System.out.printf("你猜中了！随机数是%d,你猜了%d次",number,count);
                break;
            }
        }

    }
}

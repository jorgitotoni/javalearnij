package net.addit.java.foundational.control.forstatement;

/**
 * for循环
 *
 * @author tony 241963698@qq.com
 * @version 2022/6/30 下午12:54
 * @since JDK8
 */
public class ForStatement {
    public static void main(String[] args) {
        for(int i=0;i<3;i++){
            System.out.println("Hello World");
        }
        System.out.println("********************");
        for(int i=1;i<=100;i++){
            System.out.print(i+",");
        }
        System.out.println("********************");
        for(int i=1;i<=100;i++){
            if(i%2==0){
                System.out.print(i+",");
            }
        }
        System.out.println("");
        System.out.println("********************");
        for(int i=1;i<=100;i++){
            if(i%2!=0){
                System.out.print(i+",");
            }
        }
        System.out.println("");
        System.out.println("********************");
        int sum=0;
        for(int i=1;i<=100;i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        System.out.println("sum="+sum);
        sum=0;
        for(int i=1;i<=100;i++){
            sum+=i;
        }
        System.out.println("sum="+sum);
        int countTriple=0;
        for(int i=100;i<=10000;i++){
            int hundred=i/100%10;
            int ten=i/10%10;
            int unit=i%10;
            int triple=hundred*hundred*hundred+ten*ten*ten+unit*unit*unit;
            if(i==triple){
                countTriple++;
                System.out.println(i);
            }
        }
        System.out.println("共有"+countTriple+"水仙花数");
        int count=0;
        for(int i=1000;i<10000;i++){
            int thousand=i/1000%10;
            int hundred=i/100%10;
            int ten=i/10%10;
            int unit=i%10;

            if(unit+hundred==ten+thousand && unit%2==0 &&thousand%2!=0){
                count++;
                System.out.print(i+",");
                if(count%5==0){
                    System.out.println();
                }
            }
        }
        System.out.println("符合条件的个数："+count);
    }
}

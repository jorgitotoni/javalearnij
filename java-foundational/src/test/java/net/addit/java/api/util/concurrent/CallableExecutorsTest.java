package net.addit.java.api.util.concurrent;

import java.util.concurrent.*;

/**
 * Callable接口的使用
 *
 * @author tony 241963698@qq.com
 * @version 2022/10/27 下午1:32
 * @since JDK11
 */
public class CallableExecutorsTest {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(1);
        Future<Integer> returnValue = executorService.submit(new Calculator());
        try {
            Integer result = returnValue.get();
            String name=Thread.currentThread().getName();
            System.out.println(name+": 1-100的整数和的结果"+result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}

class Calculator implements Callable<Integer>{
    /**
     * 任务
     * @return
     * @throws Exception
     */
    @Override
    public Integer call() throws Exception {
        int sum=0;
        for (int i = 0; i <= 100; i++) {
            sum+=i;
        }
        String name=Thread.currentThread().getName();
        System.out.println(name+": 1-100的整数和的结果"+sum);
        return sum;
    }
}

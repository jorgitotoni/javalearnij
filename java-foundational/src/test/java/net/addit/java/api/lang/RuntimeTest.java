package net.addit.java.api.lang;

import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Runtime常用方法的测试用例
 *
 * @author tony 241963698@qq.com
 * @version 2022/8/1 下午1:25
 * @since JDK11
 */
public class RuntimeTest {
    Runtime runtime=Runtime.getRuntime();

    /**
     * 通过Runtime获取Java程序运行时的硬件信息
     */
    @Test
    public void testRuntimeHardWare(){
        System.out.println("可用于java虚拟机的处理器数量"+runtime.availableProcessors());
        System.out.println("java虚拟机的尝试使用最大内存数量"+runtime.maxMemory());
        System.out.println("java虚拟机的可用内存数量"+runtime.freeMemory());
        System.out.println("java虚拟机的总内存数量"+runtime.totalMemory());
    }

    /**
     * 执行程序
     */
    @Test
    public void testRuntimeExec(){
        try {
            runtime.exec("wps.app");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

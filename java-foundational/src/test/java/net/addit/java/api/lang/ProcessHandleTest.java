package net.addit.java.api.lang;

import java.io.IOException;

/**
 * 获取进程相关信息测试用例
 *
 * @author tony 241963698@qq.com
 * @version 2022/8/1 下午1:40
 * @since JDK11
 */
public class ProcessHandleTest {

    public void testGetProcessInfo(){
        Runtime runtime=Runtime.getRuntime();
        String command="wps.app";
        try {
            Process process=runtime.exec(command);
            ProcessHandle processHandle = process.toHandle();
            System.out.println(command+"的进程的PID是"+processHandle.pid());
            System.out.println(command+"是否在运行"+processHandle.isAlive());

            ProcessHandle.Info info= processHandle.info();
            System.out.println(command+"的进程的命令是"+info.command().get());
            System.out.println(command+"的进程的开始时间是"+info.startInstant().get());
            System.out.println(command+"的进程的命令是"+info.totalCpuDuration().get());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

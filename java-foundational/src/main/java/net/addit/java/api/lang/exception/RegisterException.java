package net.addit.java.api.lang.exception;

/**
 * 注册异常
 *
 * @author tony 241963698@qq.com
 * @version 2022/10/7 下午7:32
 * @since JDK11
 */
public class RegisterException extends RuntimeException{
    public RegisterException(String message) {
        super(message);
        System.out.println(message);
    }
}

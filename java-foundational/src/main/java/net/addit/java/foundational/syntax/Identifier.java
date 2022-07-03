package net.addit.java.foundational.syntax;

/**
 * 标识符的命名规则和命名规范
 *
 * @author tony 241963698@qq.com
 * @version 2022/6/24 下午10:04
 * @since JDK8
 */
public class Identifier {
}

/**
 * 类的命名规范
 */
class UserInfo{
    /**
     * 常量的命名规范
     */
    public static final String DEFAULT_PASSWORD="111111";

    /**
     * 变量名的命名规范
     */
    private Long id;


    private String userName;

    /**
     * 方法的命名规范
     * @return
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

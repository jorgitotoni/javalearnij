package net.addit.java.foundational.oop.enums;

/**
 * 注册来源
 *
 * @author tony 241963698@qq.com
 * @version 2022/7/28 下午2:17
 * @since JDK11
 */
public enum RegisterSource {
    /**
     * 注册来源
     */
    ANDROID_APP("安卓客户端"),IOS_APP("ios客户端"),PC("PC端"),UNKNOWN("未知客户端");

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;

    RegisterSource(String description){
        this.description=description;
    }

}

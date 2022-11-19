package net.addit.java.foundational.oop;

import org.testng.annotations.Test;

public class CellphoneTestByTestMe {
    Cellphone cellphone = new Cellphone();

    @Test
    public void testCall() {
        cellphone.call(0L);
    }

    @Test
    public void testSendMessage() {
        cellphone.sendMessage(0L, "message");
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme
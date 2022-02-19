package com.uk.modules.hello.impl;

import com.uk.modules.hello.Message;

public class TextMessage implements Message {
    @Override
    public void message() {
        System.out.println("Text Message");
    }
}

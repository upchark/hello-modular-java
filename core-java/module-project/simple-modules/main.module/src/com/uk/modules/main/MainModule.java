package com.uk.modules.main;

import com.uk.modules.hello.HelloModule;
import com.uk.modules.hello.Message;
import com.uk.modules.hello.impl.TextMessage;

import java.util.Iterator;
import java.util.ServiceLoader;

public class MainModule {
    public static void main(String[] args) {
        System.out.println("Main Module");
        HelloModule.moduleName();
        Iterable<Message> services = ServiceLoader.load(Message.class);
        Iterator<Message> itr = services.iterator();
        while (itr.hasNext()) {
            Message message = itr.next();
            message.message();
        }
       /* Message m = new TextMessage();
        m.message();*/
    }
}

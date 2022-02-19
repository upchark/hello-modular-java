module hello.module {
    exports com.uk.modules.hello;
    exports com.uk.modules.hello.impl;
    provides com.uk.modules.hello.Message
            with com.uk.modules.hello.impl.TextMessage, com.uk.modules.hello.impl.BinaryMessage;
}
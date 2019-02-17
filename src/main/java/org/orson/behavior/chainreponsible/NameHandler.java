package org.orson.behavior.chainreponsible;

public class NameHandler extends HandlerSupport {

    public NameHandler(Handler handler) {
        super(handler);
    }

    @Override
    void doHandle(Request request) {
        request.setName("orson");
    }
}

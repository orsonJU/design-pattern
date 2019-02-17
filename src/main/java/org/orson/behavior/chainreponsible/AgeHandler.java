package org.orson.behavior.chainreponsible;

public class AgeHandler extends HandlerSupport {

    public AgeHandler(Handler handler) {
        super(handler);
    }

    @Override
    void doHandle(Request request) {
        request.setAge(27);
    }
}

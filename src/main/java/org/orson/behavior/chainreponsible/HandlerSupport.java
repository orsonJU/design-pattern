package org.orson.behavior.chainreponsible;

public abstract class HandlerSupport implements Handler {

    private Handler handler;

    public HandlerSupport(Handler handler) {
        this.handler = handler;
    }


    @Override
    public void handle(Request request) {
        this.doHandle(request);

        if(handler != null) {
            handler.handle(request);
        }
    }

    abstract void doHandle(Request request);
}

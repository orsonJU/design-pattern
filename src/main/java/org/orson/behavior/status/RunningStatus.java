package org.orson.behavior.status;

public class RunningStatus extends ThreadStatus {


    public RunningStatus(Context context) {
        super(context);
    }

    @Override
    public void start() {
        System.out.println("xxx");
    }

    @Override
    public void assignCPU() {
        System.out.println("xxx");
    }

    @Override
    public void yield() {
        System.out.println("xxx");
    }

    @Override
    public void dead() {
        System.out.println("杀死线程，进入Dead状态...");
        setStatus(context.deadStatus);
    }

    @Override
    public void _wait() {
        System.out.println("进入Blocked状态，等待被唤醒...");
        setStatus(context.blockedStatus);
    }

    @Override
    public void _notify() {
        System.out.println("xxx");
    }
}

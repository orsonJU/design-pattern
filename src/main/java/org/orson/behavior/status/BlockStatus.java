package org.orson.behavior.status;

public class BlockStatus extends ThreadStatus {


    public BlockStatus(Context context) {
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
        System.out.println("xxx");
    }

    @Override
    public void _wait() {
        System.out.println("xxx");
    }

    @Override
    public void _notify() {
        System.out.println("唤醒线程，进入Runnable状态");
        setStatus(context.runnableStatus);
    }
}

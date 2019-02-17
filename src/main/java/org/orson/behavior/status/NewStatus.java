package org.orson.behavior.status;

public class NewStatus extends ThreadStatus {


    public NewStatus(Context context) {
        super(context);
    }

    @Override
    public void start() {
        System.out.println("线程进入Runnable状态，等待CPU资源...");
        setStatus(context.runnableStatus);
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
        System.out.println("xxx");
    }
}

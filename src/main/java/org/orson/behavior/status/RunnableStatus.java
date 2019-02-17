package org.orson.behavior.status;

public class RunnableStatus extends ThreadStatus {


    public RunnableStatus(Context context) {
        super(context);
    }

    @Override
    public void start() {
        System.out.println("xxx");
    }

    @Override
    public void assignCPU() {
        System.out.println("获取CPU资源成功，进入Running状态，开始执行...");
        setStatus(context.runningStatus);
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

package org.orson.behavior.status;

public class DeadStatus extends  ThreadStatus{

    public DeadStatus(Context context) {
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
        System.out.println("xxx");
    }
}

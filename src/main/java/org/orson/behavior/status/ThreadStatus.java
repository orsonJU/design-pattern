package org.orson.behavior.status;

public abstract class ThreadStatus {


    Context context;

    public ThreadStatus(Context context) {
        this.context = context;
    }

    void setStatus(ThreadStatus status) {
        context.setThreadStatus(status);
    }

    /**
     * new状态的线程可以被start
     */
    public abstract void start ();

    public abstract void assignCPU ();

    public abstract void yield ();

    public abstract void dead ();

    public abstract void _wait ();

    public abstract void _notify ();
}

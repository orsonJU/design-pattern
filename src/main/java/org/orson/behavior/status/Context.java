package org.orson.behavior.status;

public class Context {

    // 所有状态
    ThreadStatus newStatus;
    ThreadStatus runnableStatus;
    ThreadStatus runningStatus;
    ThreadStatus blockedStatus;
    ThreadStatus deadStatus;

    private ThreadStatus threadStatus;

    public Context() {
        //prepare
        newStatus = new NewStatus(this);
        runnableStatus = new RunnableStatus(this);
        runningStatus = new RunningStatus(this);
        blockedStatus = new BlockStatus(this);
        deadStatus = new DeadStatus(this);

        //init
        this.threadStatus = newStatus;
    }

    void setThreadStatus(ThreadStatus status) {
        this.threadStatus = status;
    }

    public void start () {
        this.threadStatus.start();
    }

    public void assignCPU () {
        this.threadStatus.assignCPU();
    }

    public void yield (){
        this.threadStatus.yield();
    }

    public void dead () {
        this.threadStatus.dead();
    }

    public void _wait () {
        this.threadStatus._wait();
    }

    public void _notify () {
        this.threadStatus._notify();
    }
}

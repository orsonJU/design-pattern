package org.orson.behavior;

import org.junit.Test;
import org.orson.behavior.status.Context;

public class TestStatus {

    @Test
    public void test() {

        Context context = new Context();

        context.assignCPU(); //failed
        context.start();

        context.dead();//failed
        context.assignCPU();

        context._wait();//blocked
        context.start();//failed

        context._notify();
        context.dead();
        context.assignCPU();

        context.dead();



    }
}

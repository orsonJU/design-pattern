package org.orson.behavior.command;

import org.junit.Assert;
import org.junit.Test;

public class TestCommand {

    @Test
    public void test_command() {

        Invoker invoker = new Invoker();

        //init
        invoker.setOn(new RunCommand(), "on");
        invoker.setOff(new JumpCommand(), "off");

        invoker.switchOn("on");
        invoker.switchOff("off");
    }
}

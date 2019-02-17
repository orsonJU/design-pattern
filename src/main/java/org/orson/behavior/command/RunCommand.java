package org.orson.behavior.command;

public class RunCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Run");
    }
}

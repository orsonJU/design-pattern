package org.orson.behavior.command;

public class JumpCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Jump...");
    }
}

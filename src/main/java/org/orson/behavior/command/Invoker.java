package org.orson.behavior.command;

import java.util.HashMap;
import java.util.Map;

public class Invoker {

    Map<String, Command> onCmd = new HashMap<>();
    Map<String, Command> offCmd = new HashMap<>();

    void setOn(Command command, String key) {
        onCmd.put(key, command);
    }

    void setOff(Command command, String key) {
        offCmd.put(key, command);
    }

    public void switchOn(String key) {
        onCmd.get(key).execute();
    }

    public void switchOff(String key) {
        offCmd.get(key).execute();
    }
}

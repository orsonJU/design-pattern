package org.orson.singleton.hungry;

/**
 * Created by orson on 2018/9/8.
 */
public class HungrySingleton {


    private static HungrySingleton instance;

    static {
        HungrySingleton.instance = new HungrySingleton();
    }


    public static HungrySingleton getInstance() {
        return HungrySingleton.instance;
    }
}

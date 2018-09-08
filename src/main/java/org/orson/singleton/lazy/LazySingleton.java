package org.orson.singleton.lazy;

/**
 * Created by orson on 2018/9/8.
 */
public class LazySingleton {

    private LazySingleton instance;

    private LazySingleton() {

    }


    public LazySingleton getInstance() {

        if(instance == null) {
            synchronized(instance) {
                if(instance == null) {
                    instance = new LazySingleton();
                }
            }
        }

        return instance;
    }
}

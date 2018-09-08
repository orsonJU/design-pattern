package org.orson.singleton.register;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by orson on 2018/9/8.
 */
public class RegisterSingleton {


    private Map<String, Object> registry = new HashMap<>();


    private final Object lock = new Object();

    public <T> T getInstance(Class<T> type) {

        String name = type.getName();

        if(registry.containsKey(name)) {
            return (T)registry.get(name);
        }else {

            //套用懒汉模式的精髓
            synchronized (lock) {
                // prevent duplicated instance created
                if(Objects.isNull(registry.get(name))) {

                    Object instance = null;
                    try {
                        instance = Class.forName(name).newInstance();
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                    registry.put(name, instance);

                }
                return (T)registry.get(name);
            }
        }
    }
}

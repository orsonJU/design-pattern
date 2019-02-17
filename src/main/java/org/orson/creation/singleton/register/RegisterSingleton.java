package org.orson.creation.singleton.register;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by orson on 2018/9/8.
 */
public class RegisterSingleton {

    /**
     * private constructor
     */
    private RegisterSingleton() {
    }

    /**
     * 存放实例的数据结构
     */
    private static Map<String, Object> registry = new HashMap<>();

    private final static Object lock = new Object();

    /**
     * 获取单例对象
     * @param type 单例对象的类型
     * @param <T> 返回和要求的对象相同类型的唯一实例
     * @return 实例对象
     */
    public static <T> T getInstance(Class<T> type) {
        // 保证每个类型只拥有一个实例
        String name = type.getName();

        if(registry.containsKey(name)) {
            return (T)registry.get(name);
        }

        //套用懒汉模式的精髓
        synchronized (lock) {
            // prevent duplicated instance created
            if(Objects.isNull(registry.get(name))) {

                Object instance = null;
                try {
                    instance = Class.forName(name).newInstance();
                } catch (InstantiationException| IllegalAccessException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
                registry.put(name, instance);
            }
            return (T)registry.get(name);
        }
    }
}

package org.orson.singleton.lazy;

/**
 * Created by orson on 2018/9/8.
 */
public class LazySingleton {

    // 私有的静态变量，不能通过类直接访问
    private static LazySingleton instance;

    /**
     * 私有构造函数，不能被初始化
     */
    private LazySingleton() {

    }

    /**
     * 固定的模式
     * @return 实例对象
     */
    public static LazySingleton getInstance() {
        if(instance == null) {
            // 对整个字节码进行上锁
            synchronized(LazySingleton.class) {
                if(instance == null) {
                    instance = new LazySingleton();
                }
            }
        }

        return instance;
    }
}

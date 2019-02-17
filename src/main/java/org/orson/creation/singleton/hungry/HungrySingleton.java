package org.orson.creation.singleton.hungry;

/**
 * Created by orson on 2018/9/8.
 */
public class HungrySingleton {
    /**
     * 单例实例
     */
    private static HungrySingleton instance;

    /*
      饥饿模式下，实例在静态代码块中创建
     */
    static {
        HungrySingleton.instance = new HungrySingleton();
    }

    /**
     * 获取唯一的单例模式
     * @return 单例对象
     */
    public static HungrySingleton getInstance() {
        return HungrySingleton.instance;
    }
}

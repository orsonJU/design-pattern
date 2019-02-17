package org.orson.creation.factory.method;

/**
 * Created by orson on 2018/9/4.
 */
public abstract class FactoryMethod {


    /**
     * 首先，工厂模式就是要获取某一类具体的对象实例
     * @return the product istnace
     */
    public Product getProduct() {
        return doProduct();
    }

    /**
     * 有子类工厂是实现获取对应对象实例的创建过程
     * @return 对象实例
     */
    protected abstract Product doProduct();
}

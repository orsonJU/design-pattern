package org.orson.creation.factory.method.impl;

import org.orson.creation.factory.method.FactoryMethod;
import org.orson.creation.factory.method.Product;

/**
 * Created by orson on 2018/9/4.
 */
public class BenzFactory extends FactoryMethod {

    /**
     * 奔驰工厂
     * @return 对象实例
     */
    @Override
    protected Product doProduct() {
        return new Benz();
    }
}

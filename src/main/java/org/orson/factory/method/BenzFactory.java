package org.orson.factory.method;

/**
 * Created by orson on 2018/9/4.
 */
public class BenzFactory implements FactoryMethod<Car> {


    public Car getObject() {
        return new Benz();
    }
}

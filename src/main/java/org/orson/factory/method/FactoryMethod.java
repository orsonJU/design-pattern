package org.orson.factory.method;

/**
 * Created by orson on 2018/9/4.
 */
public interface FactoryMethod<T> {


    public <T> T getObject();
}

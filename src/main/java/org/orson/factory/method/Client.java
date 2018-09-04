package org.orson.factory.method;

/**
 * Created by orson on 2018/9/4.
 */
public class Client {


    public static void  main(String[] args) throws  Exception {

        FactoryMethod<Car> factory = new BenzFactory();

        Car benz = factory.getObject();
    }
}

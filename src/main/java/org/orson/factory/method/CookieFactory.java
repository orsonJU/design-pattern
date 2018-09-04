package org.orson.factory.method;

/**
 * Created by orson on 2018/9/4.
 */
public class CookieFactory implements FactoryMethod<Food> {

    public Food getObject() {
        return new Cookie();
    }
}

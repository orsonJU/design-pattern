package org.orson.creation.factory.method.impl;

import org.orson.creation.factory.method.FactoryMethod;
import org.orson.creation.factory.method.Product;

/**
 * Created by orson on 2018/9/4.
 */
public class CookieFactory extends FactoryMethod {


    @Override
    protected Product doProduct() {
        return new Cookie();
    }
}

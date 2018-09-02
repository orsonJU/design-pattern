package org.orson.factory.simple;

/**
 * Created by orson on 2018/9/2.
 */
public class SimpleFactory {



    public Product getProduct(final String type) {
        //type your code here

        Product product = null;

        if("A".equalsIgnoreCase(type)) {
            product = new ProductA();
        }

        return product;
    }

}

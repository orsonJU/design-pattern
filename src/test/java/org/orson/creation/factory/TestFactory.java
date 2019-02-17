package org.orson.creation.factory;

import org.junit.Assert;
import org.junit.Test;
import org.orson.creation.factory.method.FactoryMethod;
import org.orson.creation.factory.method.impl.BenzFactory;
import org.orson.creation.factory.method.impl.CookieFactory;
import org.orson.creation.factory.simple.Product;
import org.orson.creation.factory.simple.SimpleFactory;

public class TestFactory {

    @Test
    public void test_simple_factory() {

        SimpleFactory sf = new SimpleFactory();

        Product a = sf.getProduct("A");

        Assert.assertTrue("Failed", "ProductA".equals(a.getName()));
    }

    @Test
    public void test_method_factory() {
        // 场景一，生产汽车
        FactoryMethod fm = new BenzFactory();
        org.orson.creation.factory.method.Product product = fm.getProduct();
        Assert.assertTrue("Failed", "Benz".equals(product.getName()));

        //场景二， 生产饼干
        fm = new CookieFactory();
        org.orson.creation.factory.method.Product product1 = fm.getProduct();
        Assert.assertTrue("Failed", "Cookie".equals(product1.getName()));
    }
}

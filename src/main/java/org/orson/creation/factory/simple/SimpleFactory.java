package org.orson.creation.factory.simple;

/**
 * Created by orson on 2018/9/2.
 */
public class SimpleFactory {


    /**
     * @param type 需要被创建对象的类型
     * @return
     */
    public Product getProduct(final String type) {
        Product product = null;

        // 根据传入的类型创建对应的产品
        switch(type) {
            case "A": product = new ProductA();
                break;
            // default product
            default: product = new Product() {
                @Override
                public String getName() {
                    return "Default";
                }

                @Override
                public Integer getWeight() {
                    return 10;
                }
            };
        }
        return product;
    }
}

package org.orson.creation.factory.simple;

/**
 * Created by orson on 2018/9/1.
 *
 * Product对象抽象出所有产品都必须有的属性和行为.
 */
public interface Product {

    /**
     * @return product name
     */
    String getName();

    /**
     * @return product size
     */
    Integer getWeight();
}

package org.orson.factory.abstra;

/**
 * Created by orson on 2018/9/4.
 */
public class SimpleFoodFactory implements FoodFactory{


    public Food getCake() {
        return new CakeFactory().getCake();
    }

    public Food getApple() {
        return new AppleFactory().getApple();
    }
}

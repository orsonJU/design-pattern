package org.orson.creation.factory.abstra;

/**
 * Created by orson on 2018/9/4.
 */
public class SimpleColorfulFoodFactory extends SimpleFoodFactory implements ColorfulFoodFactory {

    public Food getRedApple() {

        Food apple = super.getApple();
        if(apple instanceof Apple) {
            return new ColorfulApple("Red", (Apple)super.getApple());
        }

        throw new RuntimeException("invalid apple created");
    }

    public Food getGreenApple() {
        Food apple = super.getApple();
        if(apple instanceof Apple) {
            return new ColorfulApple("Green", (Apple)super.getApple());
        }

        throw new RuntimeException("invalid apple created");
    }
}

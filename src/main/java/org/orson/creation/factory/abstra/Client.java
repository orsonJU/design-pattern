package org.orson.creation.factory.abstra;

/**
 * Created by orson on 2018/9/4.
 */
public class Client {

    public static void main(String[] args) throws Exception {

        FoodFactory factory = new SimpleFoodFactory();

        Food apple = factory.getApple();

        Food cake = factory.getCake();


        System.out.println(apple);


        SimpleColorfulFoodFactory colorfulFoodFactory = new SimpleColorfulFoodFactory();

        Food redApple = colorfulFoodFactory.getRedApple();

        Food greenApple = colorfulFoodFactory.getGreenApple();

        System.out.println(redApple);


    }
}

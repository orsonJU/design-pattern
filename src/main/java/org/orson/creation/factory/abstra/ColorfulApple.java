package org.orson.creation.factory.abstra;

/**
 * Created by orson on 2018/9/4.
 */
public class ColorfulApple implements Food{

    public String getName() {
        return String.format("%s %s", this.color, this.apple.getName());
    }

    private String color;

    private Apple apple;


    public ColorfulApple(String color, Apple apple) {
        this.color = color;
        this.apple = apple;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}

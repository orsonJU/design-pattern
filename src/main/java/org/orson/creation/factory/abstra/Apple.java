package org.orson.creation.factory.abstra;

/**
 * Created by orson on 2018/9/4.
 */
public class Apple implements Food {
    public String getName() {
        return "Apple";
    }


    @Override
    public String toString() {
        return this.getName();
    }
}


package org.abstract_animals;

import java.io.FilterOutputStream;

public class Dog extends Animal{

    String favourite_toy;

    public Dog(String name,String favourite_toy) {
        super(name);
        this.favourite_toy = favourite_toy;
    }

    @Override
    public void makeNoise() {
        System.out.println("Wof!");
    }

    @Override
    public boolean eat(String food) throws IllegalArgumentException {
        if (food == null || food.isEmpty()) {
            throw new IllegalArgumentException("Invalid food");
        }
        boolean isFed = Math.random() > 0.5;
        if (isFed) {
            return false;
        }
        System.out.println("I'm eating " + food);
        return true;
    }

    public void play() {
        System.out.println("I'm playng with " + this.favourite_toy);
    }
}

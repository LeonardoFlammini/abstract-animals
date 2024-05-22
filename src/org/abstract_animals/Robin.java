package org.abstract_animals;

public class Robin extends Animal implements CanFly{
    @Override
    public void fly() {
        System.out.printf("Chip! I'm flying");
    }

    public Robin(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Chip-Chip!");
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
}

package org.abstract_animals;

public class Dolphin extends Animal implements CanSwim{

    private final static String[] FOODS = {"fish", "squid", "shellfish"};


    public Dolphin(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("whistle-click");
    }

    @Override
    public boolean eat(String food) throws IllegalArgumentException {
        if (food == null || food.isEmpty()) {
            throw new IllegalArgumentException("Invalid food");
        }
        for (int i = 0; i < FOODS.length; i++) {
            if (FOODS[i].equals(food)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void swim() {
        System.out.println("Swim-swim! I'm swimming");
    }
}

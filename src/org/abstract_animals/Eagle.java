package org.abstract_animals;

public class Eagle extends Animal implements CanFly{

    public Eagle(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Scree-e-e!");
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


    @Override
    public void fly() {
        System.out.printf("I'm %s the eagle and I'm flying",this.getName());
    }
}

package org.abstract_animals;

public class Main {
    public static void main(String[] args) {
        Animal[] zoo = {new Dog("Thor", "bone"), new Robin("Geronimo"), new Dolphin("Madama"),
                new Eagle("Donald")};

        for (int i = 0; i < zoo.length; i++) {
            System.out.println("My name is " + zoo[i].getName());
            zoo[i].makeNoise();
            System.out.println(zoo[i].eat("Pizza") ? "I'm eating" : "I'm not eating");

            if (zoo[i] instanceof CanFly) {
                ((CanFly) zoo[i]).fly();
            }

            if (zoo[i] instanceof CanSwim) {
                ((CanSwim) zoo[i]).swim();
            }
        }
    }
}

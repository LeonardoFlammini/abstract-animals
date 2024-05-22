package org.abstract_animals;

public abstract class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void sleep() {
        System.out.println("ZZZ...");
    }


    public abstract void makeNoise();

    public abstract boolean eat(String food) throws IllegalArgumentException;
}

package com.example.Refractor.bird;

import com.example.Refractor.creature.Creature;

public abstract class Bird implements Creature {
    void fly() {
        System.out.println("I am flying");
    }

    public abstract String sing();

    public abstract String walk();
}

package com.example.Refractor.bird;

import com.example.Refractor.creature.Creature;

public abstract class Bird implements Creature {
    /*void fly() {
        System.out.println("I am flying");
    }*/

    public String sing() {
        return "I am not sure about my singing";
    }

    public String walk() {
        return "I am not sure about my walking";
    }

    public String fly() {
        return "I am not sure about my Flying";
    }

    public String swim() {
        return "I am not sure about my swimming";
    }
}

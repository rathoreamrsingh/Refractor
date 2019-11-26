package com.example.Refractor;

import com.example.Refractor.bird.Bird;
import com.example.Refractor.bird.CokooBird;

class Animal {
    void walk(){
        System.out.println("I am walking");
    }
}
public class Solution {
    public static void main(String[] args) {
        /*Bird bird = new CokooBird();
        bird.walk();
        bird.fly();*/
        //bird.sing();
        Bird bird = new CokooBird();
        System.out.println(bird.sing());
    }
}
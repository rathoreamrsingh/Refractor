package com.example.Refractor.bird;

import com.example.Refractor.features.Flying;
import com.example.Refractor.features.Singing;
import com.example.Refractor.features.Walking;
import com.example.Refractor.features.impl.FlyWithWings;
import com.example.Refractor.features.impl.SingLikeCokooBird;
import com.example.Refractor.features.impl.WalkWithTwoLegs;

public class CokooBird extends Bird {
    private Walking walking;
    private Singing singing;
    private Flying flying;

    public CokooBird() {
        this.walking = new WalkWithTwoLegs();
        this.singing = new SingLikeCokooBird();
        this.flying = new FlyWithWings();
    }

    @Override
    public String getName() {
        return "I am a cokoo bird";
    }

    public Walking getWalking() {
        return walking;
    }

    public void setWalking(Walking walking) {
        this.walking = walking;
    }

    public Singing getSinging() {
        return singing;
    }

    public void setSinging(Singing singing) {
        this.singing = singing;
    }

    @Override
    public String sing() {
        return this.singing.sing();
    }

    @Override
    public String walk() {
        return this.walking.walk();
    }

    @Override
    public String fly() {
        return this.flying.flying();
    }
}

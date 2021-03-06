package com.example.Refractor.bird;

import com.example.Refractor.features.Flying;
import com.example.Refractor.features.Singing;
import com.example.Refractor.features.Walking;
import com.example.Refractor.features.impl.HaveWingsButCannotFly;
import com.example.Refractor.features.impl.SingCluckCluckLikeChicken;

public class Chicken extends Bird{
    private Singing singing;
    private Flying flying;

    public Chicken() {
        this.singing = new SingCluckCluckLikeChicken();
        this.flying = new HaveWingsButCannotFly();
    }

    public Chicken(Singing singing, Flying flying) {
        this.singing = singing;
        this.flying = flying;
    }

    public Chicken(Singing singing) {
        this.singing = singing;
        this.flying = new HaveWingsButCannotFly();
    }

    public Chicken(Flying flying) {
        this.singing = new SingCluckCluckLikeChicken();
        this.flying = flying;
    }

    @Override
    public String fly() {
        return this.flying.flying();
    }

    @Override
    public String sing() {
        return this.singing.sing();
    }

    @Override
    public String getName() {
        return "I am a Chicken";
    }
}

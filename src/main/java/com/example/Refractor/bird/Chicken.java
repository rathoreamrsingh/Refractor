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

    @Override
    public String fly() {
        return this.singing.sing();
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

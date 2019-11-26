package com.example.Refractor.bird;

import com.example.Refractor.features.Flying;
import com.example.Refractor.features.Singing;
import com.example.Refractor.features.Swimming;
import com.example.Refractor.features.Walking;
import com.example.Refractor.features.impl.SingQuackQuackLikeDuck;
import com.example.Refractor.features.impl.SwimLikeDuck;
import com.example.Refractor.features.impl.UnknownFlyingTechnique;
import com.example.Refractor.features.impl.WalkWithTwoLegs;

public class Duck extends Bird{
    private Flying flying;
    private Walking walking;
    private Singing singing;
    private Swimming swimming;

    public Duck() {
        this.flying = new UnknownFlyingTechnique();
        this.walking = new WalkWithTwoLegs();
        this.singing = new SingQuackQuackLikeDuck();
        this.swimming = new SwimLikeDuck();
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

    @Override
    public String swim() {
        return this.swimming.swim();
    }

    @Override
    public String getName() {
        return "I am a Duck";
    }
}

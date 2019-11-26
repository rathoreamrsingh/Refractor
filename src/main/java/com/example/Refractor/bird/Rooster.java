package com.example.Refractor.bird;

import com.example.Refractor.features.Flying;
import com.example.Refractor.features.Singing;
import com.example.Refractor.features.impl.RoosterSinging;

public class Rooster extends Chicken{
    public Rooster() {
        super(new RoosterSinging());
    }
}

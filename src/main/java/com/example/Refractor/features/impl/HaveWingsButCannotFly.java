package com.example.Refractor.features.impl;

import com.example.Refractor.features.Flying;

public class HaveWingsButCannotFly implements Flying {
    @Override
    public String flying() {
        return "I have wings but I cannot Fly";
    }
}

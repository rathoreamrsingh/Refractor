package com.example.Refractor.features.impl;

import com.example.Refractor.features.Flying;

public class UnknownFlyingTechnique implements Flying {
    @Override
    public String flying() {
        return "My flying technique is misterious";
    }
}

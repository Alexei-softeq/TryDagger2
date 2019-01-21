package com.example.amaiyorov.trydagger.carcase;

import android.content.Context;

import javax.inject.Inject;

public class Car {

    private Engine engine;
    private Brand brand;
    private boolean isForeign;
    private Clutch clutch;

    @Inject
    public Car(Engine engine, Brand brand, boolean isForeign, Clutch clutch) {
        this.engine = engine;
        this.brand = brand;
        this.isForeign = isForeign;
        this.clutch = clutch;
    }

    public Engine getEngine() {
        return engine;
    }

    public Brand getBrand() {
        return brand;
    }

    public boolean isForeign() {
        return isForeign;
    }

    public Clutch getClutch() {
        return clutch;
    }
}

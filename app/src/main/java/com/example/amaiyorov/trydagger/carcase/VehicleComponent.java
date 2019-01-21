package com.example.amaiyorov.trydagger.carcase;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = VehiclesModule.class)
public interface VehicleComponent {
    Car buildCar();
}

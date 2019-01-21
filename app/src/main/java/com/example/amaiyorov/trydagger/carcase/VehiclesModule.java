package com.example.amaiyorov.trydagger.carcase;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class VehiclesModule {

    @Provides
    public Engine provideEngine() {
        return new Engine();
    }

    @Provides
    @Singleton
    public Brand provideBrand() {
        return new Brand("Baelding");
    }

    @Provides
    public boolean provideForeign() {
        return true;
    }

    @Provides
    public Clutch provideClucth() {
        return new Clutch("Aisin");
    }
}

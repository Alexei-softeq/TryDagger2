package com.example.amaiyorov.trydagger;

import dagger.Component;

@Component(modules = RandomInjectModule.class)
public interface Doctor {
    Body injectBody();
}

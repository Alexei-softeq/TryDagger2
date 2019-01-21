package com.example.amaiyorov.trydagger.skin;

public abstract class Skin {
    public abstract String getColor();

    @Override
    public String toString() {
        return getColor();
    }
}

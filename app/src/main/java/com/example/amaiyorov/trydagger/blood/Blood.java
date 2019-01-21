package com.example.amaiyorov.trydagger.blood;

public abstract class Blood {
    public abstract String getKindOfBlood();

    @Override
    public String toString() {
        return getKindOfBlood();
    }
}

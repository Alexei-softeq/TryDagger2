package com.example.amaiyorov.trydagger;

import android.util.Log;

import com.example.amaiyorov.trydagger.blood.ABBlood;
import com.example.amaiyorov.trydagger.blood.ABlood;
import com.example.amaiyorov.trydagger.blood.BBlood;
import com.example.amaiyorov.trydagger.blood.Blood;
import com.example.amaiyorov.trydagger.blood.OBlood;
import com.example.amaiyorov.trydagger.skin.DarkSkin;
import com.example.amaiyorov.trydagger.skin.RedSkin;
import com.example.amaiyorov.trydagger.skin.Skin;
import com.example.amaiyorov.trydagger.skin.WhiteSkin;
import com.example.amaiyorov.trydagger.skin.YellowSkin;

import java.util.Random;

import dagger.Module;
import dagger.Provides;

@Module
public class RandomInjectModule {
    private static Blood blood;
    private static Skin skin;

    public RandomInjectModule() {
        Log.i("rfv", "constructor RandomInjectModule called");
    }

    @Provides
    static Blood provideBlood() {
        Log.d("rfv", "provide Blood called");
        if (null != blood) {
            return blood;
        }

        Random rnd = new Random();
        int rndNumber = rnd.nextInt(3);

        switch (rndNumber) {
            case 0: blood = new OBlood(); break;
            case 1: blood = new ABlood(); break;
            case 2: blood = new BBlood(); break;
            case 3: blood = new ABBlood(); break;
            default: blood = new OBlood(); break;
        }

        return blood;
    }

    @Provides
    static Skin provideSkin() {
        Log.d("rfv", "provide Skin called");
        if (null != skin) {
            return skin;
        }

        Random rnd = new Random();
        int rndNumber = rnd.nextInt(3);

        switch (rndNumber) {
            case 0: skin = new WhiteSkin(); break;
            case 1: skin = new DarkSkin(); break;
            case 2: skin = new YellowSkin(); break;
            case 3: skin = new RedSkin(); break;
            default: skin = new WhiteSkin(); break;
        }

        return skin;
    }
}

package com.example.amaiyorov.trydagger;

import android.util.Log;

import com.example.amaiyorov.trydagger.blood.Blood;
import com.example.amaiyorov.trydagger.skin.Skin;

import javax.inject.Inject;

public class Body {

    @Inject
    Blood blood;

    @Inject
    Skin skin;

    @Inject
    public Body(){
        Log.i("rfv","constructor Body called");
    }

    public Blood getBlood() {
        Log.d("rfv", "getBlood called, blood = " + blood);
        return blood;
    }

    public void setBlood(Blood blood) {
        Log.w("rfv", "setBlood called, blood = " + blood);
        this.blood = blood;
    }


    public Skin getSkin() {
        Log.d("rfv", "getSkin called, skin = " + skin);
        return skin;
    }

    public void setSkin(Skin skin) {
        this.skin = skin;
    }
}

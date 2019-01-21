package com.example.amaiyorov.trydagger;

import android.app.Application;
import android.util.Log;

import com.example.amaiyorov.trydagger.carcase.DaggerVehicleComponent;
import com.example.amaiyorov.trydagger.carcase.VehicleComponent;

public class DagApplication extends Application {
    private static VehicleComponent vehicleComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("rfv", "DagApplication onCreate");

        vehicleComponent = DaggerVehicleComponent.builder().build();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        Log.e("rfv", "low memory");
    }

    public static VehicleComponent getVehicleComponent() {
        return vehicleComponent;
    }
}

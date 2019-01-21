package com.example.amaiyorov.trydagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.amaiyorov.trydagger.carcase.Car;
import com.example.amaiyorov.trydagger.carcase.DaggerVehicleComponent;
import com.example.amaiyorov.trydagger.carcase.VehicleComponent;

public class MainActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);

        Log.d("rfv", "will createBody");
        Body body = createBody();
        Log.d("rfv", "did createBody");
        textView.setText("kind of blood: " + body.getBlood().getKindOfBlood() + ", skin: " +body.getSkin().getColor() );

//        VehicleComponent component = DaggerVehicleComponent.create();
//        Car injectedCar = component.buildCar();
        Car injectedCar = DagApplication.getVehicleComponent().buildCar();
        Log.d("rfv", "the injected Car brand is = " + injectedCar.getBrand().getName() +
                ", engine = " +(injectedCar.getEngine() != null ? "Yes" : "null") +
                ", foreign = " + injectedCar.isForeign() + ", clutch = " + injectedCar.getClutch().getName());
    }

    private Body createBody() {
        Doctor doctor = DaggerDoctor.create();
        return doctor.injectBody();
    }
}

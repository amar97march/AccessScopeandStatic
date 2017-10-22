package com.example.amar97march.accessscopeandstatic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AlienShip girlship=new AlienShip();
        AlienShip boyship=new AlienShip();
        Log.i("numShips",""+AlienShip.getNumShips());
        girlship.shipName="ducky";
        boyship.shipName="cargo";
        Log.i("girl's ship strength is",""+girlship.getShieldStrength());
        Log.i("Boy's ship strength is",""+boyship.getShieldStrength());
        girlship.hitDetected();
        Log.i("girl's ship strength is",""+girlship.getShieldStrength());
        boyship.hitDetected();
        boyship.hitDetected();
        boyship.hitDetected();
        Log.i("Boy's ship strength is",""+boyship.getShieldStrength());
        boyship.hitDetected();
        Log.i("Boy's ship strength is",""+boyship.getShieldStrength());
        Log.i("girl's ship strength is",""+girlship.getShieldStrength());
        Log.i("numShips",""+AlienShip.getNumShips());
    }
}

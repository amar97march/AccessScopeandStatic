package com.example.amar97march.accessscopeandstatic;

import android.util.Log;

/**
 * Created by amar97march on 25-06-2017.
 */

public class AlienShip {
    private static int numShips;
    private int shieldStrength;
    public String shipName;
    public AlienShip(){
        numShips++;
        this.setShieldStrength(100);
    }
    public static int getNumShips(){
        return numShips;
    }
    private void setShieldStrength(int shieldStrength){
        this.shieldStrength=shieldStrength;
    }
    public int getShieldStrength(){
        return shieldStrength;
    }
    public void hitDetected(){
        shieldStrength-=25;
        Log.i("Incoming","BOOOOOOM!!!!");
        if(shieldStrength==0){
            destroyShip();
        }
    }
    private void destroyShip(){
        numShips-=1;
        Log.i("Explosion",""+this.shipName+" destroyed");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan5;

/**
 *
 * @author erisa
 */
public class Truck {
    
    //the truck has three fields
    public int cadence;
    public int gear;
    public int speed;
    
    //truck class has one construktor
    public Truck (int startCadence, int startSpeed, int startGear){
        
    gear = startGear;
    cadence = startCadence;
    speed = startSpeed;
    }
    //truck hac four methods
    public void setCadence (int newValue){
        cadence = newValue;
    }
    public void setGear (int newValue){
        gear = newValue;
    }
    public void applybrake (int decrement){
        speed = decrement;
        
    }
    public void speedUp (int increment){
        speed = increment;
    }
    
}

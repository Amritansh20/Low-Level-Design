package StrategyDesignPatten;

import StrategyDesignPatten.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveObject;
    
    Vehicle(DriveStrategy driveStrategy){
        this.driveObject =driveStrategy;
    }

    public void drive(){
        driveObject.drive();
    }
}

package StrategyDesignPatten;

import StrategyDesignPatten.Strategy.DriveStrategy;
import StrategyDesignPatten.Strategy.NormalDriveStrategy;

public class NormalVehicle extends Vehicle {
    
    public  NormalVehicle(DriveStrategy driveStrategy){
        super(new NormalDriveStrategy());
    }
}

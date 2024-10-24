package StrategyDesignPatten;

import StrategyDesignPatten.Strategy.DriveStrategy;
import StrategyDesignPatten.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {

    SportsVehicle(DriveStrategy driveStrategy) {
        super(new SportsDriveStrategy());
        
    }
    
}

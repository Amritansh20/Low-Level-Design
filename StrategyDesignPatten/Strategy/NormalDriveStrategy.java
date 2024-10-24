package StrategyDesignPatten.Strategy;

public class NormalDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
       System.out.println("Normaml Drive Strategy");
    }
    
}

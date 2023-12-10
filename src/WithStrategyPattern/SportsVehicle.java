package WithStrategyPattern;

import WithStrategyPattern.Strategy.DriveStrategy;
import WithStrategyPattern.Strategy.SportsStrategy;

public class SportsVehicle extends Vehicle{
    SportsVehicle(){
        super(new SportsStrategy());
    }
}

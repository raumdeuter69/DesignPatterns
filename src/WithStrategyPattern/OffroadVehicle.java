package WithStrategyPattern;

import WithStrategyPattern.Strategy.NormalStrategy;

public class OffroadVehicle extends Vehicle {

    OffroadVehicle(){
        super(new NormalStrategy());
    }
}

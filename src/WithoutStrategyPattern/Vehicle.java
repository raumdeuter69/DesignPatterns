package WithoutStrategyPattern;
/* This class has been extended by 3 other classes.
* But What if another class has the Same Functionality as one of these 3 classes.
* Here is the redundancy Issue. We use a constructor injection to tackle this.*/
public class Vehicle {
    public void drive() {
        System.out.println("Normal Drive capability");
    }
}

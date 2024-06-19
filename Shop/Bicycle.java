package Shop;

public class Bicycle implements Vehicle, BicycleInterface{
    @Override
    public void move() {
        System.out.println("Cycle is moving");
    }

    @Override
    public void stop(){
        System.out.println("Cycle has stopped");
    }

    @Override
    public void ringBell(){
        System.out.println("The bell is ringing");
    }
    @Override
    public void pedal(){
        System.out.println("The pedal is moving");
    }
}

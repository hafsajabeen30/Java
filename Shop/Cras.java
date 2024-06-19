package Shop;

public class Cras implements Vehicle, CarInterface{

    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    @Override
    public void stop(){
        System.out.println("The car has stopped");
    }

    @Override
    public void startEngine(){
        System.out.println("The engine has started");
    }
    @Override
    public void drive(){
        System.out.println("The car is driving");
    }
}



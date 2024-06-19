package Shop;

public class Main {
    public static void main(String[] args){
        Cras myCar = new Cras();
        Bicycle myBicycle = new Bicycle();

        System.out.println("The car operations:");
        myCar.move();
        myCar.stop();
        myCar.startEngine();
        myCar.drive();

        System.out.println("The bicycle operations:");
        myBicycle.move();
        myBicycle.stop();
        myBicycle.ringBell();
        myBicycle.pedal();
    }
}

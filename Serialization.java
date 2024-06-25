import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class Engine implements Serializable {
    private static final long serialVersionUID = 1L;
    private double liters;
    private int cylinders;

    Engine(double liters, int cylinders) {
        this.liters = liters;
        this.cylinders = cylinders;
    }

    public double getLiters() {
        return liters;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String toString() {
        return String.format("Engine with liters: %.1f and cylinders: %d", liters, cylinders);
    }
}

class Car implements Serializable {
    private static final long serialVersionUID = 1L;
    private String make;
    private int year;
    private Engine engine;

    Car(String make, int year) {
        this.make = make;
        this.year = year;
        this.engine = new Engine(2.4, 6);
    }

    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeDouble(engine.getLiters());
        stream.writeInt(engine.getCylinders());
    }

    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
        double liters = stream.readDouble();
        int cylinders = stream.readInt();
        this.engine = new Engine(liters, cylinders);
    }

    @Override
    public String toString() {
        return String.format("Car make is: %s, Car year is: %d, %s", this.make, this.year, this.engine);
    }
}

public class Serialization {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Car toyota = new Car("Toyota", 2021);
        Car honda = new Car("Honda", 2020);

        FileOutputStream fileOutputStream = new FileOutputStream("cars.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(toyota);
        objectOutputStream.writeObject(honda);
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("cars.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Car toyotaCopy = (Car) objectInputStream.readObject();
        Car hondaCopy = (Car) objectInputStream.readObject();
        objectInputStream.close();

        boolean isSameObject = toyotaCopy == toyota;
        System.out.println("Toyota (Copy) - " + toyotaCopy);
        System.out.println("Toyota (Original) - " + toyota);
        System.out.println("Is same object: " + isSameObject);
    }

}



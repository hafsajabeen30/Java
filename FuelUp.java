import java.util.Scanner;
public class FuelUp {
    public double calculateFuel(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the distance");
        double distance = scanner.nextDouble();
        double minFuel = 100;
        double fuelReq = distance*10;
        scanner.close();
        if(fuelReq > 100){
            return fuelReq + minFuel;
        }
        return 100;
    }

    public static void main(String[] args){
        FuelUp F = new FuelUp();
        System.out.println("The given fuel is " + F.calculateFuel() );
    }
}

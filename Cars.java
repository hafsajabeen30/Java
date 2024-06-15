public class Cars {

    private static int totalCars= 0;
    public static int maxCars = 10;
    String make;
    String model;
    int year;

    private Cars (String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
        totalCars++;
    }


    public String printInfo(){
        return " The make of the car is: " + this.make + "\n The model of the car is: " + this.model +  "\n The year is: " + this.year;
    }

    public static int getTotalCars() {
        return totalCars;
    }

    public static void main(String[] args){

        System.out.println(Cars.getTotalCars());
        Cars myCar = new Cars("Tesla", "Model Y", 2019);
        System.out.println(myCar.printInfo());
        System.out.println(Cars.getTotalCars());
        Cars yourCar = new Cars("Nisan", "Mocco", 2013);
        System.out.println(yourCar.printInfo());
        System.out.println(Cars.getTotalCars());
        System.out.println(Cars.maxCars);
    }

}

package Zoo;

public class Veterinarian {
    public void checkup(Animal animal){
         animal.makeSound();
    }
    public void checkup(Animal animal, String additionalInfo ){
        animal.makeSound();
        System.out.println(additionalInfo);
    }
}

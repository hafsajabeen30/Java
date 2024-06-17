package Zoo;

public class Cats extends Animal{
    public Cats(String name){
        super(name);
    }
    @Override
    public void makeSound(){
        System.out.println("meow meow");
    }
}

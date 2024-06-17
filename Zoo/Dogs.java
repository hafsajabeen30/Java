package Zoo;

public class Dogs extends Animal{
    public Dogs (String name){
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println("woff woff");
    }
}

package Zoo;

public class Main {
    public static void main(String[] args){
        Dogs mydog = new Dogs("Skyr");
        Animal mycat = new Cats("Luna");
//      Because we have to make an object of this class too otherwise we wont be able to call this func;
        Veterinarian vet = new Veterinarian();
        vet.checkup(mycat);
        vet.checkup(mydog, "Routine checkup");

    }
}

package Lambdas;

public class Lambda {
    public static void main(String[] args){

//        myCat.print();
//        printThing(myCat);

//        printThing( () ->  System.out.println("Meow!") );

        Printable lambdaPrinatable = s ->  System.out.println("Meow!" + s );
        printThing(lambdaPrinatable);
    }

//    it takes in any object named as thing  that implements printable so it is able to call print method on it, since our cat implements printable we can send that as a printable thing.
static void printThing(Printable thing){
        thing.print("!!");
}

}

//with lambdas you can pass in the specific implementation of the method print that we want to use.
// Instead of passing in an object that implements the print method we are passing in the implementation of print method in cat class.
// We get rid of access level, name and return type because the compiler can figure out the return type.
// Here the we pass the implementation of the print function in the cat class in printable things using lambda.
//So if we notice we are passing the implementation of the print method as a variable as we could we any other object.
// so we can save this implementation of the variable as a variable. So we do not need the object cat anymore we can directly use the function print implementation inside printable function.
// So lamdas allow you to make method implementations in to objects like normal objects that can be saved in variables and passed in to other functions as parameters.
//Lambdas can only work with functional interface meaning an interface with just one abstract method
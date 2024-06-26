public class Memory {

    public static void main(String[] args){
        doCatStuff();
    }

    private static void doCatStuff(){
        Cat myCat = new Cat();
//        garbage collector automatically removes objects without reference
//        when I do this I create a ref from myCat to the actual cat object created in memory and the garbage collector wont remove it
        myCat.meow();
        myCat = new Cat();
//        if I do this now myCat variable will reference to the new formed object and the old one above will be removed by garbage collection.
//        same happens if we set myCat = null above
    }
}

//Also since myCat is declared in the scope of doCatStuff as long as this is done and we go back up to main method, the mycat variable diminidhes so the object is left alone that is not being used so garbage collector collects it.

class Cat {
    void meow() {
        System.out.println("Meow!");
    }
}


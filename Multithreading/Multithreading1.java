package Multithreading;

public class Multithreading1 {
    public static void main (String[] args){

        for (int i=0; i<=5; i++){
            MultithreadThing1 myThing = new MultithreadThing1(i);
            Thread myThread = new Thread(myThing);
            myThread.start();
        }
    }

}
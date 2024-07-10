package Multithreading;

public class MultithreadThing1 implements Runnable{
    private int threadNumber;
    public MultithreadThing1(int threadNumber){
        this.threadNumber = threadNumber;
    }
    @Override
    public void run() {
        for (int i=1; i<=5; i++){
            System.out.println(i + " from thread number " + threadNumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
import java.util.ArrayList;
import java.util.List;

public class Printer <T,V>{
     T thingToPrint;
     V otherThing;
     public Printer(T thingToPrint){
         this.thingToPrint = thingToPrint;
     }
     public void print(){
         System.out.println(thingToPrint);
     }

     private static <T,V> void shout (T thingsToShout, V otherShout){
         System.out.println(thingsToShout + "!!!!!!!!!!!!!!");
         System.out.println(otherShout + "!!!!!!!!!!!!!!");
     }

    private static <T,V> T call(T thingsToShout, V otherShout){
        return thingsToShout;
    }

//    when you have a list of generic type you do this, wildcard
    private static void printList (List<?> myList){
         System.out.println(myList);
    }

  public static void main(String[] args){
     Printer<Integer, Integer> printer = new Printer<>(23);
     printer.print();

     Printer<Double,String> printer1 = new Printer<>(23.5);
     printer1.print();
     shout("John", "Doe");
     shout(23, "Jump Street");
     System.out.println(call("James", "Bond"));

      List<Integer> intList = new ArrayList<>();
      intList.add(23);
      intList.add(24);
      printList(intList);


  }
}

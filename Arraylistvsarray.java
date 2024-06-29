import java.util.ArrayList;
import java.util.Arrays;


public class Arraylistvsarray {
    public static void main(String[] args) {

        String[] names2 = {"Hafsa", "Aisha", "Zainab"};

        ArrayList<String> friendsArrayList2 = new ArrayList<>(Arrays.asList("Hafsa", "Maria", "Aisha", "Zainab"));

// get an element
        System.out.println(names2[0]);
        System.out.println(friendsArrayList2.get(0));

//get size
        System.out.println(names2.length);
        System.out.println(friendsArrayList2.size());
//add an element
//        cant do it with arrays easily
        System.out.println(friendsArrayList2.add ("Lisa"));
// reassign value
        System.out.println(names2[0] = "Wonka");
        friendsArrayList2.set(0,"Wonka");
        System.out.println(friendsArrayList2.get(0));
// remove element
//cant do it with arrays easily
//      you can do this as well as the next step friendsArrayList2.remove(1);
        friendsArrayList2.remove("Maria");
        System.out.println(friendsArrayList2.get(1));

//        printing out

        System.out.println(Arrays.toString(names2));
        System.out.println(friendsArrayList2);
    }
    
}

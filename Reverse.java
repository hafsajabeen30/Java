import java.sql.PreparedStatement;
import java.util.Scanner;
public class Reverse {

     public String reverseString(){
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter the string");
         String message = scanner.nextLine();
         scanner.close();
         String reversedMessage = "";
         for(int i=message.length()-1; i>=0; i--){
             reversedMessage = reversedMessage + message.charAt(i);
         }
         return reversedMessage;
     }

     public static void main(String[] args){
         Reverse R = new Reverse();
         System.out.println("The reversed string is: " + R.reverseString());
     }
}


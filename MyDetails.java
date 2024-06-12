import java.util.Scanner;
public class MyDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = scanner.nextLine();

        System.out.println("Enter your age");
        int age = scanner.nextInt();

        System.out.println("Enter your salary");
        double salary = scanner.nextDouble();

        System.out.println("Enter your marital status");
        boolean married = scanner.nextBoolean();

        System.out.println("Enter your grade");
        char grade = scanner.next().charAt(0);
        scanner.close();

        System.out.println(name + ", " +age + " ," +salary + " ,"+ married + ", "+ grade);

    }
}

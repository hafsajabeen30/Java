package Hr;

public class Main {
    public static void main(String[] args){
        Person person = new Person("Hafsa", 28);
        Employee employee = new Employee("Imran", 30, 5000);
        Manager manager = new Manager("Marius", 40, 7500, "Marketing");
        System.out.println(person);
        employee.printEmployeeDetails();
        manager.displayManagerInfo();
    }
}

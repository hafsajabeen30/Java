package Hr;

public class Employee extends Person{
    private double salary;
    public Employee (String name, int age, double salary){
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printEmployeeDetails(){
        System.out.println("Employee Name: " + getName() + ", Age: " + getAge() + ", Salary: " + getSalary());
//        System.out.println(getName() + getAge() + getSalary());
    }
}

package Hr;

public class Manager extends Employee{
    private String department;
    public Manager(String name, int age, double salary, String department){
        super(name, age, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void displayManagerInfo(){
//        System.out.println(getName() + getAge() + getSalary()+ getDepartment());
        System.out.println("Manager Name: " + getName() + ", Age: " + getAge() + ", Salary: " + getSalary() + ", Department: " + department);
    }
}

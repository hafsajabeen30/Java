abstract class AbsClass {
    public String name;
    public int age;
    public abstract void study();

    AbsClass(String name, int age){
        this.name = name;
        this.age = age;
    }
}

 class Student extends AbsClass{
    int year;
    Student(String name, int age, int year){
        super(name, age);
        this.year = year;
    }

     @Override
     public void study() {
         System.out.println("She has been studying all day");
     }

     public static void main(String[] args){
        Student myStudent = new Student("Hafsa", 28, 2018);
        System.out.println("The name of the student is " + myStudent.name);
        System.out.println("The age of the student is " + myStudent.age);
        System.out.println("The year of the student is " + myStudent.year);
         myStudent.study();
     }
 }





public class Encapsulate {
    private String name;
    private int age;

    public Encapsulate(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printData(){
        System.out.println("She is studying.");
    }
}
    class Students extends Encapsulate {
        int year;
        Students(String name, int age, int year){
            super(name, age);
            this.year = year;
        }

        @Override
        public void printData() {
            System.out.println("She has been studying all day");
        }

        public static void main(String[] args){
            Students myStudents = new Students("Hafsa", 28, 2018);
            System.out.println("The name of the student is " + myStudents.getName());
            System.out.println("The age of the student is " + myStudents.getAge());
            System.out.println("The year of the student is " + myStudents.year);
            myStudents.printData();
        }
    }


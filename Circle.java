public class Circle {
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public double calculateArea(){
        return 3.14*this.radius*this.radius;
    }

    public static void main(String[] args){
        Circle myCircle = new Circle(2.5);
        System.out.println(myCircle.calculateArea());
    }
}

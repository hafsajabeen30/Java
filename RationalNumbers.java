public class RationalNumbers {
    int num;
    int den;

    public RationalNumbers(int num, int den){
        if(den == 0){
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        this.num = num;
        this.den = den;
    }

    public static RationalNumbers add(RationalNumbers r1, RationalNumbers r2){
        int tempNum = r1.num*r2.den + r2.num*r1.den;
        int tempDen = r1.den* r2.den;
        return new RationalNumbers(tempNum, tempDen);
    }

    public static RationalNumbers subtract(RationalNumbers r1, RationalNumbers r2){
        int tempNum = r1.num*r2.den - r2.num*r1.den;
        int tempDen = r1.den* r2.den;
        return new RationalNumbers(tempNum, tempDen);
    }

    public static RationalNumbers multiply(RationalNumbers r1, RationalNumbers r2){
        int tempNum = r1.num*r2.num ;
        int tempDen = r1.den*r2.den;
        return new RationalNumbers(tempNum, tempDen);
    }

    public static RationalNumbers divide(RationalNumbers r1, RationalNumbers r2){
        int tempNum = r1.num*r2.den ;
        int tempDen = r1.den*r2.num;
        return new RationalNumbers(tempNum, tempDen);

    }

    @Override
    public String toString(){
        return num + "/" + den;
    }

    public static void main(String[] args){
        RationalNumbers r1 = new RationalNumbers(2,3);
        RationalNumbers r2 = new RationalNumbers(4,5);
        RationalNumbers sum = RationalNumbers.add(r1,r2);
        RationalNumbers sub = RationalNumbers.subtract(r1,r2);
        RationalNumbers multiply = RationalNumbers.multiply(r1,r2);
        RationalNumbers divide = RationalNumbers.divide(r1,r2);

        System.out.println("r1: " + r1);
        System.out.println("r2: " + r2);
        System.out.println("Sum: " + sum);
        System.out.println("Sub: " + sub);
        System.out.println("Multiply: " + multiply);
        System.out.println("Divide: " + divide);
    }

}
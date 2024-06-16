import java.util.Arrays;
public class Container {

    int[][] matrix;
    int[] ages;
    int id;
    public Container(int[][] matrix, int[] ages, int id){
        this.matrix = matrix;
        this.ages = ages;
        this.id = id;
    }

    public Container(int id){
        this.matrix = new int[][] {{3,4},{3,5}};
        this.ages = new int[] {3,4,5,6};
        this.id = id;
    }

    public Container(){
        this.matrix = new int[2][2];
        this.ages = new int[2];
    }


    public int avgAge(int sum){
        for (int i=0; i<this.ages.length; i++){
            sum = sum + this.ages[i];
        }
        return sum;
    }

    public double avgAge(double sum){
        for (int i=0; i<this.ages.length; i++){
            sum = sum + this.ages[i];
        }
        return sum/this.ages.length;
    }


    @Override
    public String toString(){
        return "The matrix is: " + Arrays.deepToString(matrix) + " ,the ages are: " + Arrays.toString(ages) + "the average age is: "+ avgAge(0.0) + " and the id is: " + id;

    }


    public static void main(String[] args){
        Container myContainer = new Container(new int[][] {{2,3},{4,5}}, new int[] {22,33,44,55,66,77,88,99,21,20}, 22);
        Container secContainer = new Container(10);
        Container thirdContainer = new Container();
        thirdContainer.matrix = new int[][] {{2,3}, {5,6}};
        thirdContainer.ages = new int[] {22,44};
        System.out.println("The matrix is: " + myContainer.toString());
        System.out.println("The matrix is: " + secContainer.toString());
        System.out.println("The matrix is: " + thirdContainer.toString());
    }
}


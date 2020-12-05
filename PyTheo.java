import java.lang.*;
public class PyTheo {
    public static double calculateHypotenuse(double legA, double legB) {
        // the hypotenuse is the side across from the right angle. 
        double a = (double) Math.pow(legA, 2);
        double b = (double) Math.pow(legB, 2);
        double sum = a + b; 
        double squareRoot = Math.sqrt(sum);
        return squareRoot; 
    }
    // calculate the value of c given legA and legB
    

    public static void main(String[] args) {
        System.out.println(calculateHypotenuse(5, 5));
    }
}
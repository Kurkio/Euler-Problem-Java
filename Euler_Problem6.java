import java.util.*;

public class EulerProblem4{
    /* https://projecteuler.net/problem=6
     The sum of the squares of the first ten natural numbers is,

    1^2 + 2^2 + ... + 10^2 = 385
    The square of the sum of the first ten natural numbers is,

    (1 + 2 + ... + 10)^2 = 55^2 = 3025
    Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

    Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.*/
    public static int sumOfSquare(int num){
        int sum = 0;
        for ( int y = 1; y <= num; y++){
            sum += Math.pow(y,2);
        }
        return sum;
    }
    public static int squareOfSum(int num){
        int sum = 0;
        for ( int x = 1; x <= num; x++){
            sum += x;
        }
        int sumPow = (int) Math.pow(sum, 2);
        return sumPow;
    }
    public static void main(String []args){
        int firstSuit = 100;
        int result = squareOfSum(firstSuit) - sumOfSquare(firstSuit);
        System.out.println(sumOfSquare(firstSuit));
        System.out.println(squareOfSum(firstSuit));
        
        System.out.println("The difference between the sum of the squares of the first one hundred natural numbers and the square of the sum: " + result);
        
    }
    
}
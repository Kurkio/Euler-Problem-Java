import java.util.*;

public class EulerProblem4{
    /* https://projecteuler.net/problem=5
     2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

    What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?*/
    public static boolean isDivisable(int a, int b){
        if (a % b == 0){
            return true;
        }
        return false;
    }
    public static int modulateRange(int min, int max){
        int modResult = 1;
        for(int i = min; i <= max; i++){
            if (isDivisable(modResult, i) == false){
                modResult += 1;
                i = min;
            }
        }
        return modResult;
    }
    public static void main(String []args){
        //System.out.println(isDivisable(4,3));
        int min = 1;
        int max = 20;
        int result = modulateRange( min, max);
        System.out.println("The smallest positive number that is evenly divisible by all of the numbers from " + min + " to " + max + " : " + result);
        
    }
    
}
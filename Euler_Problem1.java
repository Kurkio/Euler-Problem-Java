import java.util.*;

public class EulerProblem1{
    /* https://projecteuler.net/problem=1
     If we list all the natural numbers below 10 that are multiples of 3 or 5, 
     we get 3, 5, 6 and 9. The sum of these multiples is 23.
     Find the sum of all the multiples of 3 or 5 below 1000.*/
    
    public static void main(String []args){
        int outOf = 1000;
        List<Integer> multiplesOf3and5 = new ArrayList<Integer>();
        for (int i = 1; i < outOf; i++ ){
            
            if (i % 3 == 0 || i % 5 == 0) {
            multiplesOf3and5.add(i);
            //System.out.println(i);
            }
        }
        int addUp = 0;
        for (int j : multiplesOf3and5){
            addUp += j;
        }
        int result = addUp;
        System.out.println("Multiples of 3 or 5 added up below " + outOf + ": " + result);
    }
}
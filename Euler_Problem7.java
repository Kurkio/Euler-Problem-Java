import java.util.*;

public class EulerProblem4{
    /* https://projecteuler.net/problem=7
     By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

    What is the 10 001st prime number?.*/
    public static boolean isPrime(int x){
        for ( int i = 2; i < x; i++){
            if (x % i == 0){
                return false;
            }
        }
        return true;
    }
    public static int primeByIndex(int index){
        int counter = 1;
        int i = 0;
        while(i < index){
            counter += 1;
            if (isPrime(counter)== true){
                i +=1;
            }
            
        }
        return counter;
    }
    public static void main(String []args){;
        int index = 10001;
        int result = primeByIndex(index);
        System.out.println("The 10,001st prime number is: " + result);
        
    }
    
}
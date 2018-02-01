import java.util.*;

public class EulerProblem3{
    /* https://projecteuler.net/problem=3
     The prime factors of 13195 are 5, 7, 13 and 29.

    What is the largest prime factor of the number 600851475143 ?*/
    
    public static boolean isPrime(long x){
        for ( int i = 2; i < x; i++){
            System.out.println(x + " % " + i + " == " + (x % i));
            if (x % i == 0){
                System.out.println("Factors: " + i + " and " + x/i);
                return false;
            }
        }
        return true;
    }/*
    public static int biggestFactor(long x){
        for ( int i = 2; i < x; i++){
            System.out.println(x + " % " + i + " == " + (x % i));
            if (x % i == 0){
                int firstfactor =x/i;
                return false;
            }
    }*/
    public static void main(String []args){
        long n = 600851475143L;
        String test = (isPrime(n) ? " is a prime number." : " is not a prime number.");
        System.out.println(n + test);
        int result = 2 + 3;
        System.out.println("The prime factor for 600851475143 is: " + result);
        
    }
    
}
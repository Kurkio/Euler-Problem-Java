import java.util.*;

public class EulerProblem3{
    /* https://projecteuler.net/problem=3
     The prime factors of 13195 are 5, 7, 13 and 29.

    What is the largest prime factor of the number 600851475143 ?*/
    
    public static boolean isPrime(long x){
        for ( int i = 2; i < x; i++){
            if (x % i == 0){
                return false;
            }
        }
        return true;
    }
    public static List<Long> primeFactors(long f){
        List<Long> factors = new ArrayList<Long>();
        long iFactor = 0;
        long nFactor = 0;
        for ( Long i = 2L; i < Math.sqrt(f); i++){
            if (f % i == 0){
                if (i>iFactor) {
                    iFactor = i;
                    nFactor = f/i;
                    if (isPrime(iFactor)){
                        factors.add(iFactor);
                    }
                    if (isPrime(nFactor)){
                        factors.add(nFactor);
                    }
                }
            }
        }
        return factors; 
    }
    public static void main(String []args){
        long n = 600851475143L;
        isPrime(n);
        List<Long> factorList = primeFactors(n);
        System.out.println(factorList);
        long result = Collections.max(factorList);
        System.out.println("The largest prime factor for " + n + " is: " + result);
        
    }
    
}
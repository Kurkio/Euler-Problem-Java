import java.util.*;

public class EulerProblem4{
    /* https://projecteuler.net/problem=4
     A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

    Find the largest palindrome made from the product of two 3-digit numbers.*/
    public static boolean isPalindrome (int num){
        String s = Integer.toString(num);
        List<Integer> intByIndex = new ArrayList<Integer>();
        for (int index = 0; index < s.length(); index++){
            intByIndex.add(Integer.parseInt(s.substring(index, index+1)));
        }
        int firstNumIndex = 0;
        int lastNumIndex = s.length()-1;
        for (int k = 0; k < (s.length()/2); k++){
            if (intByIndex.get(firstNumIndex+k) != intByIndex.get(lastNumIndex-k)){
                return false;
            }
        }
        
        return true;
    }
    public static boolean isPrime(long x){
        for ( int i = 2; i < x; i++){
            if (x % i == 0){
                return false;
            }
        }
        return true;
    }
    public static int largestPalindromesPrime (int min, int max){
        List<Integer> allPalsP = new ArrayList<Integer>();
        int nMin = min*min;
        int nMax = max*max;
        for( int p = nMin; p <= nMax; p++){
            if (isPalindrome(p) && !isPrime(p)){
                allPalsP.add(p);
            }
        }
        int largestPalTrip = 0;
        for ( int t : allPalsP){
            List<Integer> palFacts = Factors(t,min,max);
            if (palFacts.size() > 0 && t > largestPalTrip){
                largestPalTrip = t;
                
            }
        }
        return largestPalTrip;
    }    
    public static List<Integer> Factors(int f, int min, int max){
        List<Integer> factors = new ArrayList<Integer>();
        for ( int c = min; c <= max; c++){
            if (f % c == 0){
                if (f/c >= min && f/c <= max){
                    factors.add(c);
                    factors.add(f/c);
                    return factors;
                }
            }
        }
        return factors;
    }
    public static void main(String []args){
        int min = 100;
        int max = 999;
        int largestPal = largestPalindromesPrime(min, max);
        List<Integer> palFact = Factors(largestPal, min, max);
        int result = largestPal;
        System.out.println(palFact);
        System.out.println("The largest palindrome made from the product of two 3-digit numbers is: " + result);
        
    }
    
} 

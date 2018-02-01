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
    public static void main(String []args){
        int min = 100 * 100;
        int = max = 999 * 999;
        int n = 9009;
        System.out.println(isPalindrome(n) ? n + " is a palindrome." : n + " is not a palindrome.");
        int result = 2 + 3;
        System.out.println("The largest palindrome made from the product of two 3-digit numbers is: " + result);
        
    }
    
}
import java.util.*;

public class EulerProblem2{
    /* https://projecteuler.net/problem=2
     Each new term in the Fibonacci sequence is generated by adding the previous two terms. 
     By starting with 1 and 2, the first 10 terms will be:

    1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

    By considering the terms in the Fibonacci sequence whose values do not exceed four million,
    find the sum of the even-valued terms.*/
    
    public static void main(String []args){
        List<Integer> fibSequence = new ArrayList<Integer>();
        fibSequence.add(1);
        fibSequence.add(2);
        int nextTerm = 0;
        while (nextTerm <4000000){
        int secondLastTerm = fibSequence.get(fibSequence.size()-2);
        int lastTerm = fibSequence.get(fibSequence.size()-1);
        nextTerm = secondLastTerm + lastTerm;
        if (nextTerm > 4000000){
        } else{
        fibSequence.add(nextTerm);
        }
        }
        int addTo = 0;
        for (int i : fibSequence){
            if (i % 2 == 0) {
                System.out.println(i);
                addTo += i;
            }
        }
        int result = addTo;
        System.out.println("The sum of the even-valued terms of the Fibornacci sequence that do not exceed 4,000,000: " + result);
        
    }
    
}
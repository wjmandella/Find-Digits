// My solution to the HackerRank.com problem "Find Digits."
//https://www.hackerrank.com/challenges/find-digits/problem

import java.util.Arrays;
import java.util.Scanner;

public class FindDigitsApp {
    static int findDigits(int n) {
    	int nbrOfDigitDivisors = 0;
    	
    	String number = String.valueOf(n);
    	char[] digits1 = number.toCharArray();
    	
    	for(int i = 0; i < digits1.length; i++) {
    		int digit = Character.getNumericValue(digits1[i]);
    		if(digit == 0) {
    			continue;
    		} else if (n % digit == 0) {
    			nbrOfDigitDivisors++;
    		}
    	}
    	
    	System.out.println("digits1 =" + Arrays.toString(digits1));
 	
    	return nbrOfDigitDivisors;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of test cases, t (integer 1-15): "); 
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            System.out.print("Enter an integer (0 - 1000000000) for test case #"+(a0 +1)+": "); 
            int n = in.nextInt();
            int result = findDigits(n);
            System.out.println(result);
        }
        in.close();
    }
}

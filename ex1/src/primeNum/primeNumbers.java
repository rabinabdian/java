package primeNum;

import java.util.Scanner;

public class primeNumbers {

	public static void main(String[] args) {
	    System.out.println("This program takes the user input and prints the prime numbers until that number");
	    System.out.println ("Enter Number:");
	    Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();

	    long startValue = 2;
	    long primeNumbersToTest = num;
	    for (long i = startValue; i <= primeNumbersToTest; i++) {
	        if (findPrime(i).equals("Prime")) {
	            System.out.println(i + " is Prime");
	        } else {
	            System.out.println(i + " is not Prime");
	        }
	    }
		sc.close();
	}

	private static Object findPrime(long num) {


		  boolean isPrime = true;
		    for (long i = 2; i <= num / i; i++) {
		        if ((num % i) == 0) {
		            isPrime = false;
		            break;
		        }
		    }
		    if (isPrime)
		        return "Prime";
		    else
		        return "Not Prime";
	}



}

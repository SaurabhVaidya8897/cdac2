package assignment2;
import java.util.Scanner;
public class FibonacciRecursion {
	    public static int fibonacci(int n) {
	        if (n <= 1) {
	            return n;
	        } else {
	            return fibonacci(n - 1) + fibonacci(n - 2);
	        }
	    }
	    public static void main(String[] args) {
	        int terms = 10; // Number of terms in the Fibonacci series

	        if (terms <= 0) {
	            System.out.println("Please enter a positive integer.");
	        } else {
	            System.out.println("Fibonacci sequence:");
	            for (int i = 0; i < terms; i++) {
	                System.out.println(fibonacci(i));
	            }
	        }
	    }
	}


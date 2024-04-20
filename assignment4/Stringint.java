package assignment4;

import java.util.Scanner;

public class Stringint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		try {
			String s = sc.next();
			int n = Integer.parseInt(s);
			System.out.println("Digits" + n);
		} catch (Exception e) {
			System.out.println("non digits");
		}

	}
}

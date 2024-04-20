package assignment4;

import java.util.Scanner;

public class StringBufferdemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");
		String s = scanner.next();
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < s.length(); i++) {
			char currentChar = s.charAt(i);
			boolean isDuplicate = false;
			for (int j = 0; j < i; j++) {
				if (s.charAt(j) == currentChar) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				sb.append(currentChar);
			}
		}

		System.out.println("String after removing duplicates: " + sb);
	}
}

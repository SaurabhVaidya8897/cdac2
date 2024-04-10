package assignment2;
import java.util.Scanner;
public class Fibonacci1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,a=0,b=1,sum=0,n;
		System.out.println("Enter number");
		n=sc.nextInt();
		for(i=1; i<=n-2; i++) {
			sum=a+b;
			a=b;
			b=sum;
		}
		System.out.println(n+"th Fibonacci series is "+sum);
	}

}

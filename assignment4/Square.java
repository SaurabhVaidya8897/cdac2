package assignment4;
import java.util.Scanner;
public class Square {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n;
		try {n=sc.nextInt();
			int sqaure=n*n;
			System.out.println("square"+sqaure);
		}catch(Exception e){
			System.out.println("Invalid...........");
			System.out.println(e.getMessage());
		}finally {
			sc.close();
		}

	}

}

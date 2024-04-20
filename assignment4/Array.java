package assignment4;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.println("enter size");
		size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter Array");
		try {for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}	
		int position;
		System.out.println("enter psoition");
		position=sc.nextInt();
		System.out.println("the value of nth array is"+arr[position]);
		if (position > 0 && position <= 5) {
            System.out.println("Value at position " + position + ": " + arr[position - 1]);
        } else {
            System.out.println("Invalid position. Position should be betweee");
        }
		}catch(Exception e){
			System.out.println("the value of nth position in array is invalid");
			System.out.println(e.getMessage());
	}finally {
		sc.close();
	}

	}
}

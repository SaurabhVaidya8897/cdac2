package assignment4;
import java.util.Scanner;
import java.util.StringTokenizer;
public class StringTokenizer1 {

	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("PG DAC");
		try {
		String token1=st.nextToken();
		System.out.println(token1);
		String token2=st.nextToken();
		System.out.println(token2);
		String token3=st.nextToken();
		System.out.println(token3);
		}catch(Exception e) {
			System.out.println("there is no additional token");
		}
		
	}

}

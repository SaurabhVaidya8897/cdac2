package assignment4;

public class Palindrome {

	public static void main(String[] args) {
		String s="saras";
		boolean flag=false;
		for(int i=0; i<s.length()/2; i++) {
			if(s.charAt(i)!=s.charAt(s.length()-i-1))
			{
				flag=false;
			}
			
			else {
				flag=true;
			}
		}
		if(flag==true) {
			System.out.println("given string is plaindrone");
		}
		else
		{
			System.out.println("given string is not a plaindrone");
		}
		

	}

}

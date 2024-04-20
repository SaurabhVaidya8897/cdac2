package assignment4;

public class WrapperDemo {

	    public static void main(String[] args) {
	        Integer int1 = new Integer(5);
	        Integer int2 = new Integer(5);
	        
	        System.out.println("Comparing Integer objects:");
	        System.out.println("Using == operator: " + (int1 == int2)); 
	        System.out.println("Using equals() method: " + int1.equals(int2)); 

	       
	        Float float1 = new Float(5.0);
	        Float float2 = new Float(5.0);

	        System.out.println("\nComparing Float objects:");
	        System.out.println("Using == operator: " + (float1 == float2));
	        System.out.println("Using equals() method: " + float1.equals(float2)); 
	    }
	}


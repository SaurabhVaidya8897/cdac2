package assignment4;

public class Calculator {
	    private int num1;
	    private int num2;

	    public Calculator(int num1, int num2) {
	        this.num1 = num1;
	        this.num2 = num2;
	    }

	    public int add() {
	        if (num1 < 0 || num2 < 0) {
	            throw new ArithmeticException("Numbers for addition must be positive.");
	        }
	        return num1 + num2;
	    }

	    public int subtract() {
	        if (num1 < 0 || num2 < 0) {
	            throw new ArithmeticException("Numbers for subtraction must be positive.");
	        }
	        return num1 - num2;
	    }

	    public int multiply() {
	        if (num1 == 0 || num2 == 0) {
	            throw new ArithmeticException("Numbers for multiplication must not be zero.");
	        }
	        return num1 * num2;
	    }

	    public int divide() {
	        if (num2 == 0) {
	            throw new ArithmeticException("Second number for division must not be zero.");
	        }
	        return num1 / num2;
	    }
	

	    public static void main(String[] args) {
	        try {
	            Calculator obj1 = new Calculator(10, 5);
	            System.out.println("Addition: " + obj1.add());

	            Calculator obj2 = new Calculator(10, 5);
	            System.out.println("Subtraction: " + obj2.subtract());

	            Calculator obj3 = new Calculator(10, 5);
	            System.out.println("Multiplication: " + obj3.multiply());

	            Calculator obj4 = new Calculator(10, 0);
	            System.out.println("Division: " + obj4.divide());

	         
	        } catch (NumberFormatException e) {
	            System.out.println("NumberFormatException: Input must be a valid integer.");
	        } catch (ArithmeticException e) {
	            System.out.println("ArithmeticException: " + e.getMessage());
	        }
	    }
	}

package assignment3;

public class Triangle {
	private double side1,side2,side3;
	
	
	public Triangle(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public double Perimeter() {
		return side1+side2+side3;
	}
	public double Area() {
		double s=Perimeter()/2;
		return Math.sqrt (s*(s-side1)*(s-side2)*(s-side3));
	}

	public static void main(String[] args) {
			Triangle tri=new Triangle(3, 4, 5);
			System.out.println("perimeter of Triangle"+tri.Perimeter());
			System.out.println("Area of Triangle"+tri.Area());
			

	}

}

package assignment3;

public class Employee {
	private double salary;              
	private double noofhrs;
	
	public Employee(double salary, double noofhrs) {
		super();
		this.salary = salary;
		this.noofhrs = noofhrs;
		
	}

	public void Addsal() {
		if (salary<500) {
			salary=salary+10;
		}
	}
	public void	addWork() {
		if(noofhrs>6) {
			salary=salary+5;
		}
		
	}
	public void getinfo() {
		Addsal();
		addWork();
		System.out.println("salary"+salary);
}
//	public void displayInfo() {
//		System.out.println("Salary"+salary);
//		System.out.println("Noofhours"+noofhrs);
//		//System.out.println("updated salary"+updsalary);
//	}
	
	public static void main(String[] args) {
		Employee e1=new Employee(800,5);
		e1.getinfo();
		
	}
}

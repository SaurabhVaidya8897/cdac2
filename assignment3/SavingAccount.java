package assignment3;

public class SavingAccount {
	static double intrestrate;
	private double balance;
	
	
	public SavingAccount(double balance) {
		super();
		this.balance = balance;
	}
	public SavingAccount(String accno) {
		super();
		this.balance = balance;
	}
	public double getbalance() {
		return balance;
	}
	
	public void  calMonthlyInterest() {
		double intrest= (balance*intrestrate)/12;
		balance=balance+intrest;
	}
	
	public static void modifyintrestRate(double newrate) {
		intrestrate=newrate;
	}


	public static void main(String[] args) {
		SavingAccount saver1=new SavingAccount(2000);
		SavingAccount saver2=new SavingAccount(3000);
		System.out.println(saver1.balance);
		System.out.println(saver2.balance);
		
		SavingAccount.modifyintrestRate(0.03);
		saver1.calMonthlyInterest();
		saver2.calMonthlyInterest();
		
		System.out.println("Saver1 Balance	="+saver1.getbalance());
		System.out.println("Saver2 Balance ="+saver2.getbalance());
		
		SavingAccount.modifyintrestRate(0.04);
		saver1.calMonthlyInterest();
		saver2.calMonthlyInterest();
		
		System.out.println("Saver1 balance ="+saver1.getbalance());
		System.out.println("Saver2 balance ="+saver2.getbalance());

	}
}

/*
 * Author: dharmaraj.pawale@stl.tech
 * Creation Date: 8-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
public class Account {
	
	// instance variables (non-static)
	private int accNo;
	private String ownerName;
	private double balance;
	private float durationInYears;
	
	// class variables (static)
	private static float interestRate;
	private static int count;
	
	// static init block
	static {
		
		interestRate = 0.07f;
		System.out.println("static init block of Account");
		
	}
	
	public Account() {
		// TODO Auto-generated constructor stub
		
		accNo = 12345;
		ownerName = "Abc";
		balance = 1000.00;
		durationInYears = 1.0f;
		count++;
	}
	
	public Account(int accNo,String ownerName,double balance,float durationInYears) {
		this.accNo = accNo;
		this.ownerName = ownerName;
		this.balance = balance;
		this.durationInYears = durationInYears;
		count++;
	}
	
	// class method (static)
	public static float getInterestRate() {
		return interestRate;
	}
	
	public static void setInterestRate(float interestRate) {
		Account.interestRate = interestRate;
	}
	
	public void calculateInterest() {
		double interestAmount = balance * durationInYears * interestRate;
		System.out.println("Interest Amount: " + interestAmount);
	}
	
	public static int getCount() {
		return count;
	}
	
	// callback method
	public String toString() {
		return "Acc. No.:"+accNo + "\tOwnerName: " + ownerName +
				"\tBalance Amount: " + balance +
				"\tDuration in years: " + durationInYears;
	}
	
	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * System.out.println("start of main in Account"); float intRt =
	 * Account.getInterestRate(); System.out.println("Current Interest Rate: " +
	 * intRt); }
	 */
}

/*
 * Author: dharmaraj.pawale@stl.tech
 * Creation Date: 8-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start of main in AccountMain");
		float intRt = Account.getInterestRate();
		System.out.println("Current Interest Rate: " + intRt);
		
		Account ac1 = new Account();
		Account ac2 = new Account(45323, "Sunil Kumar", 23000.00, 1.5f);
		
		System.out.println("No. of Accounts: "+Account.getCount());
	
		ac1.calculateInterest();
		ac2.calculateInterest();
		
		int a= 10;
		System.out.println(a);
		Account ac3 = new Account();
		System.out.println(ac3);
	
	}

}

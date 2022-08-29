package com.oops.customer;

public class BankStatement extends Customer_Account_Statement{

	public BankStatement(int depositAmount, int CustId, double amount, double deposit_withdrawl, String deposit_date) {
		super(depositAmount, CustId, amount, deposit_withdrawl, deposit_date);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		    int amount = 8000;
	        int withdrawAmount = 4000;
	        int depositAmount = 2000;
	        // withdrawing amount
	        //amount = (int) amountWithdrawing(amount, withdrawAmount);
	        // depositing amount
	        //amount = (int) amountDepositing(amount, depositAmount);
	        
	        // calling display balance
	                //displayBalance(amount);
	        
	        //Customer c1 = new Customer(withdrawAmount, depositAmount, null);
	        
	        //Branch b1 = new Branch(depositAmount, null, null);
	        
	        Customer_Account_Statement cas = new
	                Customer_Account_Statement
	                (depositAmount, amount, withdrawAmount, depositAmount, null);
	        
	        cas.amountDepositing(withdrawAmount, depositAmount);
	        cas.amountWithdrawing(withdrawAmount, depositAmount);
	        cas.displayBalance(depositAmount);
	   }

}

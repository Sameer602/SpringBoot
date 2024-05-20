package com.jtc;

public class DebitCardPayment implements IPayment{
	
	public boolean processPayment(double billAmt) {
		//logic
		System.out.println("Debit card Payment processed....");
		return true;
	}

}

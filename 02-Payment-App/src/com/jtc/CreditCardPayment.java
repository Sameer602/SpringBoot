package com.jtc;

public class CreditCardPayment implements IPayment{
	
	public boolean  processPayment(double billAmt) {
		//logic
		System.out.println("Credit card Payment Processed");
		return true;
	}

}

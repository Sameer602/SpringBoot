package com.jtc.beans;

public class DebitCardPayment implements IPayment {
	public DebitCardPayment() {
		System.out.println("DebitCardPayment :Constructor");
	}
	  public boolean processPayment(double billAmt) {
		  //logic
		  System.out.println("Debit Card Payment Successfull...");
		  return true;
	  }

}

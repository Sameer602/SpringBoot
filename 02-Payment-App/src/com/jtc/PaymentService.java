package com.jtc;

public class PaymentService {
	
	  private IPayment payment;
	  
	  public PaymentService(IPayment payment) {
		  this.payment = payment;
	  }
	  
	  public void doPayment(double billAmt) {
		  
		  boolean status = payment.processPayment(billAmt);
	  
	  if(status) {
		  System.out.println("Printing Receipt.......");
	  }else {
		  System.out.println("Payment Declined......");
	  }
	 }
}

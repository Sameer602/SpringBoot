package com.jtc.beans;

public class PaymentService {
	  private IPayment payment;
	  public PaymentService() {
		  System.out.println("PaymentService :0-Constructor");
		  
	  }
	  public PaymentService(IPayment payment) {
		  System.out.println("PaymentService :Param-Constructor");
		  this.payment=payment;
	  }
	  
	  public void doPayment(double billAmt) {
		  boolean status=payment.processPayment(billAmt);
		  if(status) {
			  System.out.println("Receipt Printing...");
		  }else {
		       System.out.println("Card Declined");
		  }
		  
	  }

}

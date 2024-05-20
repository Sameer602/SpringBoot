package com.jtc;

public class SodexoCardPayment implements IPayment{
	
	public boolean  processPayment(double billAmt){
		//logic
		System.out.println("Sodexo card Payment Processed");
		return true;
	}
}

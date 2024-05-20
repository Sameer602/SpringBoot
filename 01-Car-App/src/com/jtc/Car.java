package com.jtc;

public class Car  {
	
	
	  private IEngine eng;
	  
	  public Car(IEngine eng) {
		  this.eng = eng;
	  }
	
	  public void drive() {
		  	  
		int status =  eng.start();
		
		if(status >= 2) {
			System.out.println("Journey Started");
		}else {
			System.out.println("Engine Trouble");
		}
	  }
	  
}

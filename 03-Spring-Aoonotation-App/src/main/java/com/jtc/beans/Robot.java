package com.jtc.beans;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class Robot {
	
	@Autowired
	private Chip chip;
	
	public Robot() {
		System.out.println("Robot::Constructor");
	}
	
   public void doWork() {
	   String type=chip.chipType();
	   if(type.equals("32-Bit")) {
		   System.out.println("Performance is Slow....");
	   }
   }
}

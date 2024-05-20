package com.jtc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustRestController {
	  
	  @GetMapping("/")
	  public Customer getCustomer() {
		  
		  Customer c =new Customer();
		  c.setId(1);
		  c.setName("Sameer");
		  c.setEmail("s@gmail.com");
		  c.setPhno((long) 9650);
		  
		  return c;
	  }

}

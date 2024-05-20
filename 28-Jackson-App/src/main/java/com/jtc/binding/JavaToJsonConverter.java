package com.jtc.binding;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJsonConverter  {
	
	public static void main(String[] args) throws Exception {
		
		Address addr = new Address();
		addr.setCity("Delhi");
		addr.setState("UT");
		addr.setCountry("India");
		  
		Customer c = new Customer();
		 c.setId(1);
		 c.setName("Sameer");
		 c.setEmail("s@gmail.com");
		 c.setPhno((long) 9650);
		 c.setAddr(addr);
		 
		 ObjectMapper mapper = new ObjectMapper();
		 mapper.writeValue(new File("customer.json"),c);
		 System.out.println("Json File Created");
	}

}

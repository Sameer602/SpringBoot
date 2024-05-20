package com.jtc.beans;
import org.springframework.stereotype.Component;
@Component
public class UserDao {
	@PostConstruct
	public void init() throws Exception{
		System.out.println("getting db connection....");	
	}
	
	public void getData() {
		System.out.println("getting data from db.......");
	}
	@PreDestroy
	public void destroy() throws Exception{
		System.out.println("closing db connection......");
	}

}

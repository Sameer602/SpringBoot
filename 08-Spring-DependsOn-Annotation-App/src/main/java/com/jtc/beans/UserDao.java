package com.jtc.beans;
 import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;

@Component
public class UserDao implements InitializingBean {
	
	public void afterPropertiesSet() throws Exception{
		System.out.println("getting data from db.....");
		System.out.println("store data into redis....");
		
	}

}

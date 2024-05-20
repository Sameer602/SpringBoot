package com.jtc.beans;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class UserDao implements InitializingBean,DisposableBean{
	
	public void afterPropertiesSet() throws Exception{
		System.out.println("init-method...");
		
	}
	
	public void destroy() throws Exception{
		System.out.println("destroy-method......");
		
	}
	
	public void getData() {
		System.out.println("getting data from db....");
	}

}

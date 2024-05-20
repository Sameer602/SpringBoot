package com.jtc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	  public static void main(String[] args) {
		
	  ApplicationContext context = new ClassPathXmlApplicationContext("com/jtc/Beans.xml");
	    UserDao dao = context.getBean(UserDao.class);
	    dao.getData();
	    
	    ConfigurableApplicationContext cctxt=(ConfigurableApplicationContext)context;
		  cctxt.close();
	}

}

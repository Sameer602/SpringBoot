package com.jtc.beans; 
 import org.springframework.context.ApplicationContext;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	  public static void main(String[] args) {
		
		  ApplicationContext ctxt=new ClassPathXmlApplicationContext("com/jtc/Beans.xml");
		  UserDao dao= ctxt.getBean(UserDao.class);
		  dao.getData();
		  
		  ConfigurableApplicationContext cctxt=(ConfigurableApplicationContext)ctxt;
		  cctxt.close();
	}

}



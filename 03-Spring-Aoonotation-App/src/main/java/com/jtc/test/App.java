package com.jtc.test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.jtc.config.AppConfig;
public class App {
	  public static void main(String[] args) {
		 
		 // ApplicationContext ctxt = new ClassPathXmlApplicationContext("");
		  ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
	}

}

package com.jtc.test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jtc.AppConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Test {
	  public static void main(String[] args) {
		 
		 // ApplicationContext ctxt = new ClassPathXmlApplicationContext("");
		  ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
	}

}


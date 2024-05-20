package com.jtc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jtc.entity.Student;
import com.jtc.repo.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext ctxt =SpringApplication.run(Application.class, args);
	
	          StudentRepository repo = ctxt.getBean(StudentRepository.class);
	          
	           Student std = new Student();
	           //std.setStudentId(102);
	           std.setStudentName("Sonika");
	           std.setStudentClass(10);
	           std.setStudentAddr("Lonavala");
	           
	           repo.save(std);
	}

}

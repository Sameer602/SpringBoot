package com.jtc;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.jtc.entity.Employee;
import com.jtc.repo.EmployeeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		           
		    EmployeeRepository repo =   ctxt.getBean(EmployeeRepository.class);
		    /*
		    Employee e1 = new Employee(1,"Arjun",5000.00,"Male","Sales");
		    Employee e2 = new Employee(2,"Ram",6000.00,"Male","Market");
		    Employee e3 = new Employee(3,"Shyam",7000.00,"Male","Stock");
		    Employee e4 = new Employee(4,"Krishna",8000.00,"Male","HR");
		    Employee e5 = new Employee(5,"Shiva",9000.00,"Male","R&D");
		    Employee e6 = new Employee(6,"Indra",10000.00,"Male","BusinessAnalyst");
		    repo.saveAll(Arrays.asList(e1,e2,e3,e4,e5,e6));
		    System.out.println("Record Saved...");
		    */
		           /*
		            List<Employee> emps = repo.findAll();
		            emps.forEach(System.out::println);
		            */
		                /*
		                 Sort ascending = Sort.by("empName").ascending();
		                 List<Employee> emps = repo.findAll(ascending);
		                 emps.forEach(System.out::println);
		                 */
		                 /*
		                 Sort sort = Sort.by("empName").descending();
		                 List<Employee> emps = repo.findAll(sort);
		                 emps.forEach(System.out::println);
		                */ 
		                 //same as for salary ascending or descending we can do
	// for multiple pro->  Sort sort= Sort.by("empName","empSalary").ascending()/descending()
		    
		    //Pagination
		    /*
		     int pageNo=1;
		    
		     PageRequest page =  PageRequest.of(pageNo-1,2);
		 
		     Page<Employee> findAll = repo.findAll(page);
		     
		     List<Employee> emps = findAll.getContent();
		     
		     emps.forEach(System.out::println);
		    */
		    
		    //QuerybyExample  
		    Employee emp = new Employee();
		    emp.setEmpGender("Male");
		    emp.setEmpDept("Sales");
		    
		    Example<Employee> exmp = Example.of(emp);
		    
		    List<Employee> emps = repo.findAll(exmp);
		     emps.forEach(System.out::println);
	}

}

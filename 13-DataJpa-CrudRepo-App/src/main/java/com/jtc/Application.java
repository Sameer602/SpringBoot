package com.jtc;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jtc.entity.Book;
import com.jtc.repo.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		        BookRepository repo =   ctxt.getBean(BookRepository.class);
		        System.out.println(repo.getClass().getName());
		       /* 
		        Book b1 = new Book();
		        b1.setBookId(103);
		        b1.setBookName("React JS");
		        b1.setBookPrice(4500.00);
		        
		        Book b2 = new Book();
		        b2.setBookId(104);
		        b2.setBookName("DSA");
		        b2.setBookPrice(5000.00);
		        
		        Book b3 = new Book();
		        b3.setBookId(105);
		        b3.setBookName("SystemDesign");
		        b3.setBookPrice(10000.00);
		        
		        
		        
		        repo.saveAll(Arrays.asList(b1,b2,b3));
		        System.out.println("Record Inserted......");
		      */
		   /* 
           Optional<Book> findById = repo.findById(105);    
		     if(findById.isPresent()) {
		    	 System.out.println(findById.get());
		     }
		   */  
		     
		  /*
		        
		  boolean status = repo.existsById(105);
		  System.out.println("Record Presence ::" + status);
		  */
		   /*
		   Iterable<Book> findAllById = repo.findAllById(Arrays.asList(101,103,105));   
		   for(Book b:findAllById) {
			   System.out.println(b);
		   }
		   */
		        /*
		        Iterable<Book> findAll = repo.findAll();
		        for(Book b:findAll) {
		        	System.out.println(b);
		        }
		        */
		        
	}

}

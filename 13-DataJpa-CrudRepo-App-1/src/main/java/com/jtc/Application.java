package com.jtc;

import java.util.List;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jtc.entity.Book;
import com.jtc.repo.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		 ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		 
		 BookRepository repo = ctxt.getBean(BookRepository.class);
		 
		 /*
		 List<Book> books = repo.findByBookPriceGreaterThan(2500.00);
		 for(Book b:books) {
			 System.out.println(b);
		 }
		 */
		 /*
		 List<Book> books = repo.findByBookName("Spring");
		 for(Book b:books) {
			 System.out.println(b);
		 }
		 */
		 List<Book> books= repo.getAllBooks();
		 for(Book b:books) {
			 System.out.println(b);
		 }
		 System.out.println("==============");
		 
		 repo.getBooks();
		
		 
	}


}

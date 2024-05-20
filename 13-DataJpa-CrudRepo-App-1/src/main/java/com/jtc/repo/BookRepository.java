package com.jtc.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.jtc.entity.Book;

public interface BookRepository extends CrudRepository<Book,Integer>{
	          /*
	          // select * from book where book_price > :price
	           public List<Book> findByBookPriceGreaterThan(Double price);
	           
	           //select * from book where book_price < :price
	           public List<Book> findByBookPriceLessThan(Double price);
	           
	           //select * from book where book_name = :name
	           public List<Book> findByBookName(String bookName);
	           */
	           @Query(value="select * from book" ,nativeQuery=true)   //Pain SQL Query
	          public List<Book> getAllBooks();
	           
	           @Query("from Book")     //HQL Query
	           public List<Book> getBooks();

}

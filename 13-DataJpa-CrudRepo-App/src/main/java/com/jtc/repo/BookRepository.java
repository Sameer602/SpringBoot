package com.jtc.repo;

import org.springframework.data.repository.CrudRepository;

import com.jtc.entity.Book;

public interface BookRepository extends CrudRepository<Book,Integer>{

}

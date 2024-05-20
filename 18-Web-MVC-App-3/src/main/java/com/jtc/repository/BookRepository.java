package com.jtc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jtc.entity.Book;

public interface BookRepository extends JpaRepository<Book,Integer> {

}

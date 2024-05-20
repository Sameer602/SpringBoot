package com.jtc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jtc.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{

}

package com.jtc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jtc.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity,Integer> {

}

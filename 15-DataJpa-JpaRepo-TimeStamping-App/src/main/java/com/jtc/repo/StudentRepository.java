package com.jtc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jtc.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}

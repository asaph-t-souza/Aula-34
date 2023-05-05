package com.t3.springrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.t3.springrest.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
    
}

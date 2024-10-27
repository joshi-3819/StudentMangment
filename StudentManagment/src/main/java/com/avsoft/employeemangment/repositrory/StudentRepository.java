package com.avsoft.employeemangment.repositrory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avsoft.employeemangment.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}

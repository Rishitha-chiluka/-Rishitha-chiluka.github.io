package com.springboot.studentsapplication.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.studentsapplication.data.entity.Student;

public interface StudentsRepository extends CrudRepository<Student, Integer> {
	
	Student findById( int id );
}

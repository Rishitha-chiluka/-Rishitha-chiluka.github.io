package com.springboot.studentsapplication.service;

import com.springboot.studentsapplication.data.entity.Student;

public interface StudentService {
	
	Iterable<Student> all();

    Student get( int studentId );

    Student save( Student student );

    void delete( int studentId );

}

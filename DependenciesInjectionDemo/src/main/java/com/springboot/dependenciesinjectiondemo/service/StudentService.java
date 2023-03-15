package com.springboot.dependenciesinjectiondemo.service;

import java.util.List;

import com.springboot.dependenciesinjectiondemo.model.Student;

public interface StudentService {
	
	void add( Student student );

    void delete( Student student );

    List<Student> all();

    Student findById( String id );


}

package com.springboot.dependenciesinjectiondemo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dependenciesinjectiondemo.model.Student;
import com.springboot.dependenciesinjectiondemo.service.StudentService;

@RestController
@Qualifier("studentServiceImplMap")
public class StudentController {
	
	@Autowired
	private final StudentService studentService;

	public StudentController(@Qualifier("studentServiceImplMap") StudentService studentService)
    {
		super();
        this.studentService = studentService;
        studentService.add(new Student("M6", 412, "Rishitha", "Chiluka", "Indian", "Mission Hospital Road", new Date()));
    }

    @GetMapping("/student/{id}")
    Student findById( @PathVariable( "id" ) String id )
    {
        return studentService.findById( id ); 
    }
    
    @GetMapping("/map")
    public List<Student> getAllStudents(){
    	System.out.println("Using map configuration");
    	return studentService.all();
    }
    
}

package com.springboot.studentsapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.studentsapplication.data.entity.Student;
import com.springboot.studentsapplication.repository.StudentsRepository;


@Service
public class StudentServiceImpl implements StudentService {
	
	private final StudentsRepository studentsRepository;

    public StudentServiceImpl( @Autowired StudentsRepository studentsRepository )
    {
        this.studentsRepository = studentsRepository;
    }

	@Override
	public Iterable<Student> all() {
		// TODO Auto-generated method stub
		return studentsRepository.findAll();
	}

	@Override
	public Student get(int studentId) {
		// TODO Auto-generated method stub
		return studentsRepository.findById( studentId );
	}

	@Override
	public Student save(Student student) {
		// TODO Auto-generated method stub
		return studentsRepository.save( student );
	}

	@Override
	public void delete(int studentId) {
		// TODO Auto-generated method stub
		studentsRepository.deleteById( studentId );
	}

}

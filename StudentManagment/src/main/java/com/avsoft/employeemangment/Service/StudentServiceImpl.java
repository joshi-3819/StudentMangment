package com.avsoft.employeemangment.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avsoft.employeemangment.entity.Student;
import com.avsoft.employeemangment.repositrory.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
    
	
	
	@Autowired 
	StudentRepository Sr;
    
	@Override
	public void save(Student student){
		
		Student sr;
		
		
	}

}

package com.avsoft.employeemangment.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.avsoft.employeemangment.Service.StudentService;
import com.avsoft.employeemangment.entity.Student;

@RestController
public class StudentController {

	@Autowired
	StudentService service;
	
	@PostMapping("/save/student")
	public String saveStudent(@RequestBody Student student)
	{
		
		service.save(student);
		
		return "saved";
	}






}

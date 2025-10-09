package com.example.demoProj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoProj.entity.employee;
import com.example.demoProj.services.empservices;

@RestController

public class empcontroller {
	@Autowired
	empservices es;
	

	@PostMapping("/addemp")
	public employee addemp(@RequestBody employee emp)
	{
		return es.addemp(emp);
	}
	
	
	@DeleteMapping("/deletingrecord")
	public void deleteEmp(@PathVariable int eid)
	{
		es.delemp(eid);
	}

}

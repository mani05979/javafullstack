package com.example.demoProj.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoProj.entity.employee;
import com.example.demoProj.repo.emprepo;



@Service
public class empservices {


		@Autowired
		emprepo er;
		
		
		//insert
		public employee addemp(employee Emp)
		{
			return er.save(Emp);
		}
		
		//delete
		public void delemp(int eid)
		{
			er.deleteById(eid);
		}
	}


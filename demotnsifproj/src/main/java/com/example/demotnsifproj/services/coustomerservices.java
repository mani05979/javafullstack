package com.example.demotnsifproj.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demotnsifproj.entity.coustomer;
import com.example.demotnsifproj.repo.coustomerrepo;
import java.util.List;

	@Service

	public class coustomerservices {
	
		@Autowired
		coustomerrepo cr;
			
		
		//insert
		
	public coustomer addcoust(coustomer Coust)
	{
		
		return cr.save(Coust);
	}
		
	//delete
	public void delcoust(int cid)
	{
		cr.deleteById(cid);
	}
		
	//update
	
	public coustomer updatecoust(Integer Id,coustomer Coust)
	{
		coustomer coustomer = cr.findById(Id).get();
		coustomer.setCname(Coust.getCname());	
		coustomer.setCphone(Coust.getCphone());	
		coustomer.setCemail(Coust.getCemail());
		
		return cr.save(Coust);
	}
	
	// retrieving all the data
		public List<coustomer> getAllcoustomers(){
			return cr.findAll();
			}
		
		// deleting all rows
		public void deleteAllcoustomers() {
			cr.deleteAll();
		}
		
		
		
	}

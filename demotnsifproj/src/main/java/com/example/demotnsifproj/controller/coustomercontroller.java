package com.example.demotnsifproj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demotnsifproj.entity.coustomer;
import com.example.demotnsifproj.services.coustomerservices;
import java.util.List;

@RestController
public class coustomercontroller {
	
	@Autowired
	coustomerservices cs;
	
	@PostMapping("/addcoustomer")
	public coustomer addcoustomer(@RequestBody coustomer Coust)
	{
		return cs.addcoust(Coust);
	}
	
	
	@DeleteMapping("/delcoustomer/{cid}")
	public coustomer deletecoust(@PathVariable int cid )
	{
		cs.delcoust(cid);
		return null;
	}
	
	// entire deleting all rows
		@DeleteMapping("/delcustomer")
		public void deleteAllcoustomers() {
			cs.deleteAllcoustomers();
		}
		
		// update
		@PutMapping("/updcustomer/{cid}")
		public coustomer updateCustomer(@PathVariable int cid, @RequestBody coustomer customerDetails) {
			return cs.updatecoust(cid, customerDetails);
		}

	
		// retrieve
		@GetMapping("/getcustomer") // normal way to get all data
		public List<coustomer> getAllcoustomers(){
			return cs.getAllcoustomers();
		}

}

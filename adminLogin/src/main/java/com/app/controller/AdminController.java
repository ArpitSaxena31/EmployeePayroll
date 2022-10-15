package com.app.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Admin;
import com.app.repo.AdminRepo;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = "http://localhost:4200/")

public class AdminController {

	@Autowired
	private AdminRepo repo;  
	
	@PostMapping("/login")
	public ResponseEntity<?> loginAdmin(@RequestBody Admin adminData){
		Admin admin=repo.findByAdminID(adminData.getAdminID());
		if(admin.getPassword().equals(adminData.getPassword()))
			return ResponseEntity.ok(admin);
		
		return (ResponseEntity<?>) ResponseEntity.internalServerError();

	}
}

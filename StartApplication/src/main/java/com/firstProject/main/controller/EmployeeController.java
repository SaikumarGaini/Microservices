package com.firstProject.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firstProject.main.projectentity.Employees;

import com.firstProject.main.service.EmployeeService;
@RestController
@Controller
@RequestMapping("/Employees")
public class EmployeeController {
	@Autowired
	public EmployeeService service;
	
	@PostMapping("/Insert")
	public ResponseEntity<String> insertEmp(@RequestBody Employees emp)
	{
		String X =  this.service.insertEmp(emp);
	 return new ResponseEntity<>(X,HttpStatus.CREATED);	
	}
	
	@GetMapping("/FetchAll")
	public ResponseEntity<List<Employees>> fetchEmp(){
		List<Employees> empLst = this.service.fetchEmp();
		return new ResponseEntity<>(empLst,HttpStatus.OK);
		
	}
	
	@PutMapping("/Update/{id}")

	public ResponseEntity<String> updateEmp(@RequestBody Employees emp,@PathVariable Integer id){	
	String p = this.service.updateEmp(emp,id);
		return new ResponseEntity<>(p,HttpStatus.OK);
	}
	
	@DeleteMapping("/Delete/{id}")
	public ResponseEntity<String> deleteEmp(@RequestBody Employees emp,@PathVariable Integer id){
		String q=this.service.deleteEmp(emp,id);
		return new ResponseEntity<>(q,HttpStatus.OK);
	}
	
}

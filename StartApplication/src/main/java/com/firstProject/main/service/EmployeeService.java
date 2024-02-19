package com.firstProject.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import com.firstProject.main.projectentity.Employees;
import com.firstProject.main.repo.EmployeeRepo;

@Service
public class EmployeeService {
	@Autowired EmployeeRepo employeRepo;

	public String insertEmp(Employees emp) {
		// TODO Auto-generated method stub
		this.employeRepo.save(emp);
		return "Inserted";
	}

	public List<Employees> fetchEmp() {
		// TODO Auto-generated method stub
		List<Employees> listEmp = this.employeRepo.findAll();
		return listEmp;
	}

	public String updateEmp(Employees emp, Integer id) {
		// TODO Auto-generated method stub
		if(employeRepo.existsById(id)) {
			Optional<Employees> x= employeRepo.findById(id);
			Employees y = x.get();
			y.setEmpName(emp.getEmpName());
			y.setEmpSal(emp.getEmpSal());
			y.setEmpAddress(emp.getEmpAddress());
			y.setEmpAge(emp.getEmpAge());
			y.setDob(emp.getDob());
			employeRepo.save(y);
			return "Updated Succesfull";
		}
		else {
		return "Employee Not found by this id";
		
	}
	}

	public String deleteEmp(Employees emp, Integer id) {
		// TODO Auto-generated method stub
		if(employeRepo.existsById(id)) {
			this.employeRepo.deleteById(id);
			return "Deleted Succesfull";
		}else {
		return "Employee Not found by this id";
		}
	}
	
	

}

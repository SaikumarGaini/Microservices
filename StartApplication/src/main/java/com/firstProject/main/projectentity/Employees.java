package com.firstProject.main.projectentity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table

public class Employees {
	public Employees() {
	
		
		
	}
	@Id
	private Integer empId;
	private String empName;
	private double empSal;
	private Integer empAge;
	private String empAddress;
	private Date dob;
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	public Integer getEmpAge() {
		return empAge;
	}
	public void setEmpAge(Integer empAge) {
		this.empAge = empAge;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Employees(Integer empId, String empName, double empSal, Integer empAge, String empAddress, Date dob) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empAge = empAge;
		this.empAddress = empAddress;
		this.dob = dob;
	}
	
	

}

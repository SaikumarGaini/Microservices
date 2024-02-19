package com.firstProject.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.firstProject.main.projectentity.Employees;
@Repository
public interface EmployeeRepo extends JpaRepository<Employees, Integer>{

}

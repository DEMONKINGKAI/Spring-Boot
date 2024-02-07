package com.demo.spring.demo_project.service;
import java.util.List;

import com.demo.spring.demo_project.entity.EmployeeEntity;
public interface EmployeeService {
	List<EmployeeEntity> findAllEmployee();
	EmployeeEntity findById(Long id);
	EmployeeEntity saveEmployee(EmployeeEntity employeeEntity);
	EmployeeEntity updateEmployee(EmployeeEntity employeeEntity);
	void deleteEmployee(Long id);

}

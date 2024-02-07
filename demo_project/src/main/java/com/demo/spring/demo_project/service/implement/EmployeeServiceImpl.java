package com.demo.spring.demo_project.service.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.demo.spring.demo_project.entity.EmployeeEntity;
import com.demo.spring.demo_project.repository.EmployeeRepository;
import com.demo.spring.demo_project.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private final EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<EmployeeEntity> findAllEmployee() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Optional<EmployeeEntity> findById(Long id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id);
	}

	@Override
	public EmployeeEntity saveEmployee(EmployeeEntity employeeEntity) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employeeEntity);
	}

	@Override
	public EmployeeEntity updateEmployee(EmployeeEntity employeeEntity) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employeeEntity);
	}

	@Override
	public void deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
		
	}

}

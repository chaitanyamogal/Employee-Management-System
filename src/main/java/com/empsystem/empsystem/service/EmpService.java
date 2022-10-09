package com.empsystem.empsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empsystem.empsystem.entity.Employee;
import com.empsystem.empsystem.repository.EmpRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EmpService {
	
	@Autowired
	private EmpRepository repo;
	
	public void addEmp(Employee e) {
		repo.save(e);
	}
	
	public List<Employee> getAllEmp(){
		return repo.findAll();
	}

	public Employee getEmployeeId(int id)
	{
		Optional<Employee> e = repo.findById(id);
		if(e.isPresent()) {
			return e.get();
		}
		return null;
	}
	
	public void deleteEmp(int id) {
		repo.deleteById(id);
	}
}
